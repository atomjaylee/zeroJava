## 获取Class类的实例方法

1. 已知具体的类，通过类的class属性获取，最安全可靠，性能最高
```Java
Class clazz = Person.class;
```

2. 已知某个类的实例，调用实例的getClass方法获取，方法来自Object
```java
Class clazz = person.getClass();
```

3. 已知类的全类名和类的路径，通过Class类静态方法forName获取，可能抛出ClassNotFountException
```java
Class clazz = Class.forName("com.xcharge.reflection.User");
```