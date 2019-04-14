public class ClassB {


    ClassO linkToO; //Создаем ссылку

    ClassB(ClassO objO){
        linkToO = objO; //Присваиваем ссылку на объект О
    }

    public  void test(){
        System.out.println("I am linkToO "+ linkToO);
        linkToO.show();
    }
}
