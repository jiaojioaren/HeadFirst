# Head First Design Patterns Demo  

**Head First 设计模式示例**

Welcome to the **Head First Design Patterns** code repository! This project contains demo implementations of various design patterns described in the **"Head First Design Patterns"** book.  
欢迎来到 **《Head First 设计模式》** 代码仓库！本项目包含书中介绍的多种设计模式的示例实现。

---

## 📖 About the Book | 关于本书

"Head First Design Patterns" is a hands-on guide to learning software design patterns using engaging examples. The book covers patterns used in object-oriented programming to solve common design problems and build reusable, flexible, and maintainable software.  
《Head First 设计模式》是一本通过丰富示例讲解软件设计模式的实践指南。书中涵盖了面向对象编程中的设计模式，帮助解决常见设计问题，并构建可复用、灵活且易于维护的软件。

---

## 🗂️ Repository Structure | 仓库结构

Each design pattern has its own folder with example code.  
每个设计模式都有自己的文件夹，包含相应的代码示例。

```
/HeadFirstDesignPatterns
│
├── /decorator             # Decorator Pattern | 装饰者模式
│   ├── Beverage.java      # Base class for beverages | 饮料基类
│   ├── Espresso.java      # Concrete beverage class | 具体饮料类
│   ├── MilkDecorator.java # Decorator for milk | 牛奶装饰者
│   └── SugarDecorator.java # Decorator for sugar | 糖装饰者
│
├── /observer              # Observer Pattern | 观察者模式
│   ├── WeatherData.java   # Observable class | 可观察对象类
│   ├── CurrentDisplay.java # Observer class | 观察者类
│   └── Test.java          # Demo application | 示例应用
│
└── README.md              # Documentation | 文档
```

---

## 📋 Patterns Covered | 包含的设计模式

- **Decorator Pattern 装饰者模式**: Dynamically adds behavior to objects without modifying their structure.  
  动态为对象添加行为，而不修改其结构。

- **Observer Pattern 观察者模式**: Establishes a one-to-many relationship between objects so that changes in one object are reflected in others.  
  建立对象之间的一对多关系，一个对象状态变化时，其他对象会收到通知。

- **Strategy Pattern 策略模式**: Encapsulates different algorithms and selects them at runtime.  
  封装不同的算法，并在运行时选择适用的算法。

- **Singleton Pattern 单例模式**: Ensures that a class has only one instance.  
  确保一个类只有一个实例。

- **Factory Pattern 工厂模式**: Abstracts object creation to avoid dependency on specific implementations.  
  抽象对象创建逻辑，避免依赖具体实现。

- **Command Pattern 命令模式**: Encapsulates requests as objects to parameterize clients with different requests.  
  将请求封装为对象，使客户端能够使用不同的请求进行参数化。

---

## 🚀 How to Run the Code | 如何运行代码

1. **Clone the Repository 克隆仓库**:

   ```bash
   git clone https://github.com/your-username/HeadFirstDesignPatterns.git
   ```

2. **Navigate to the Project Directory 进入项目目录**:

   ```bash
   cd HeadFirstDesignPatterns
   ```

3. **Compile and Run the Code 编译并运行代码**:
   Use the following command to compile and run individual pattern demos:  
   使用以下命令编译并运行各模式示例：

   ```bash
   javac path/to/Main.java
   java path.to.Main
   ```

---

## 🛠️ Requirements | 环境要求

- **Java Development Kit (JDK) 8+**  
- A text editor or IDE (such as IntelliJ IDEA or VSCode)  
- 文本编辑器或集成开发环境（如 IntelliJ IDEA 或 VSCode）

---

## 📚 Learning Resources | 学习资源

- [Head First Design Patterns Book on Amazon](https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124)  
  《Head First 设计模式》亚马逊购买链接

- [Official Java Documentation](https://docs.oracle.com/en/java/)  
  官方 Java 文档

---

## 🤝 Contributing | 如何贡献

Feel free to fork this repository and submit pull requests if you have improvements or additional examples.  
欢迎 Fork 本仓库并提交 Pull Request，贡献你的改进或示例代码。

---

## 📝 License | 许可证

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.  
本项目采用 MIT 许可证，详情请参阅 [LICENSE](LICENSE) 文件。

---

## 📧 Contact | 联系方式

If you have any questions or feedback, feel free to reach out!  
如有任何问题或反馈，请随时联系我！
