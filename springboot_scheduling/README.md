#springboog定时任务

1. 启动类添加注解

   ```
   @EnableScheduling
   ```

2. 定时类注解

   ```
   @Component
   ```

3. @Scheduled注释详解

   ```java
   public @interface Scheduled {
       //根据石英表达式执行
       String cron() default "";
       //指定时间地区，默认系统时间地区
       String zone() default "";
       //上一次执行成功后多少毫秒后执行
       long fixedDelay() default -1L;
       //同上，只不过值是String形式
       String fixedDelayString() default "";
       //固定速率执行
       long fixedRate() default -1L;
       //同上，只不过值是String形式
       String fixedRateString() default "";
       //延迟多少毫秒后执行
       long initialDelay() default -1L;
       //同上，只不过值是String形式
       String initialDelayString() default "";
   }
   
   //石英表达式（每一分钟执行一次），具体的就不在这描述啦
   @Scheduled(cron = "0 0/1 * * * ?") 
   public void run() {
     //执行代码
   }
   
   //定义一个按一定频率执行的定时任务，每隔1分钟执行一次，延迟1秒执行
       @Scheduled(fixedRate = 1000 * 60,initialDelay = 1000)
       public void run() {
       //执行代码
   }
   
   //上一个任务完成后，两分钟后执行
       @Scheduled(fixedDelay = 1000 * 120)
       public void run() {
       //执行代码
   }
   @Scheduled(fixedRate = 6000)：上一次开始执行时间点之后6秒再执行
   @Scheduled(fixedDelay = 6000)：上一次执行完毕时间点之后6秒再执行
   @Scheduled(initialDelay=1000, fixedRate=6000)：第一次延迟1秒后执行，之后按fixedRate的规则每6秒执行一次
   @Scheduled(cron = "0 0 16 * * ?")：按时间执行的定时任务，在每天16:00执行一次。
   ```

4. 注意

   ```
   	定时任务一直无法执行完成，无法设置下次任务执行时间，之后会导致此任务后面的所有定时任务无法继续执行，也就会出现所有的定时任务“失效”现象。
   	所以应用springBoot中定时任务的方法中，一定不要出现“死循环”、“http持续等待无响应”现象，否则会导致定时任务程序无法正常。再就是非特殊需求情况下可以把定时任务“分散”下。
   ```

   ```java
   可继承SchedulingConfigurer类并重写其方法
   @Configuration
   @EnableScheduling
   public class ScheduleConfig implements SchedulingConfigurer {
   
       @Override
       public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
           taskRegistrar.setScheduler(taskExecutor());
       }
   
       @Bean(destroyMethod="shutdown")
       public Executor taskExecutor() {
           return Executors.newScheduledThreadPool(10);
       }
   }
   ```

   