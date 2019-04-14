class Main{
    public static void main(String[] args) {

        ClassX objX = new ClassX(); //Создаем объект X
        ClassB objB = new ClassB(objX.objC.objT.objO); //Создаем объект B и передаем ему ссылку на объект O


        objB.test();
    }
}