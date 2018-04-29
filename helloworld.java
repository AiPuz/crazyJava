/**
 * helloworld
 */
public class helloworld{
    public static void main(String[] args) {
        System.out.println("hello world!");
        Person lee = new Person();
        lee.name = "bruce";
        lee.say(lee.name);
        lee.jump();
    }
}

class Person{
    String name;
    int age;
    void say(String content){
        System.out.println(content);
    }

    void jump(){
        this.say("hello");
    }
}

//javac -d destdir srcFile
