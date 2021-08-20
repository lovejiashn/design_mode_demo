# design_mode_demo

## java设置模式  
  1. **工厂方法模式-factory-design** \
      **工厂方法模式介绍** \
![image](https://user-images.githubusercontent.com/29700538/130209850-778d8e8f-42ed-43b1-8462-b4d54e402262.png)

工厂模式又称工厂方法模式，是一种创建型设计模式.

**实现步骤：** \
&nbsp;&nbsp;&nbsp;&nbsp; *提供一个公用接口，并提供需要实现的方法 \
&nbsp;&nbsp;&nbsp;&nbsp; *具体的业务即子类，实现该接口 \

这种设计模式也是 Java 开发中最常见的一种模式，它的主要意图是定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。

简单说就是为了提供代码结构的扩展性，屏蔽每一个功能类中的具体实现逻辑。让外部可以更加简单的只是知道调用即可，同时，这也是去掉众多 <font color=red>ifelse</font> 的方式。当然这可能也有一些缺点，比如需要实现的类非常多，如何去维护，怎样减低开发成本。但这些问题都可以在后续的设计模式结合使用中，逐步降低。
   
