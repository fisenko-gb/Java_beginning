public class Main {
    public static void main(String[] args) {
        Worker currentWorker = new Worker();
        currentWorker.print();

        currentWorker = new CreateWorker()
                .setFullName("Владимир Ильич")
                .setAge(123)
                .setSalary(1500)
                .setAddress("Красная площадь")
                .setJobTitle("Политик")
                .Create();
        currentWorker.print();

        Goods currentGoods = new Goods();
        currentGoods.print();

        currentGoods = new CreateGoods()
                .setCount(1)
                .setName("Товар1")
                .setPrice(22.50)
                .setDescription("Описание товара 1")
                .Creat();
        currentGoods.print();
    }
}

class Worker {

    int age;
    int salary;
    String fullName;
    String jobTitle;
    String address;

    public void print() {
        System.out.println(
                String.format(
                        "%s %d %d %s %s",
                        this.fullName,
                        this.age,
                        this.salary,
                        this.jobTitle,
                        this.address));
    }
}

class CreateWorker{
    Worker temp;

    public CreateWorker(){
        temp = new Worker();
        temp.address = "--";
        temp.jobTitle = "--";
        temp.age = -1;
        temp.salary = -2;
        temp.fullName = "нет данных";
    }

    public CreateWorker setAge(int age){
        temp.age = age;
        return this;
    }
    public CreateWorker setSalary(int salary){
        temp.salary = salary;
        return this;
    }
    public CreateWorker setFullName(String fullName){
        temp.fullName = fullName;
        return this;
    }
    public CreateWorker setJobTitle(String jobTitle){
        temp.jobTitle = jobTitle;
        return this;
    }
    public CreateWorker setAddress(String address){
        temp.address = address;
        return this;
    }

    public Worker Create(){
        return temp;
    }

}

class Goods{
    public int count;
    public String name;
    public double price;
    public StringBuilder description;

    public void print() {
        System.out.println(
                String.format(
                        "%d %s %s %s",
                        this.count,
                        this.name,
                        this.price,
                        this.description));
    }

}

class CreateGoods{
    Goods temp;

    public CreateGoods(){
        temp = new Goods();
        temp.count = -1;
        temp.name = "без имени";
        temp.price = -1;
        temp.description = new StringBuilder("нет описания");
    }
    public CreateGoods setCount(int count){
        temp.count = count;
        return this;
    }

    public CreateGoods setName(String name){
        temp.name = name;
        return this;
    }

    public CreateGoods setPrice(double price){
        temp.price = price;
        return this;
    }

    public CreateGoods setDescription(String description){
        temp.description = new StringBuilder(description);
        return this;
    }

    public Goods Creat(){
        return temp;
    }

}