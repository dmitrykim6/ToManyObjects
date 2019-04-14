public class ClassC {
    ClassT objT; //Создаем объект Т
    private ClassZ linkToZ2; //Создаем ссылку


    ClassC(ClassZ objZ, ClassY objY){
        objT = new ClassT(objZ, objY); // передаем объекту Т ссылку на объект Y и на объект Z

        linkToZ2 = objZ; // Присваиваем ссылку на объект Z
        System.out.println("I am linkToZ2 " + linkToZ2);

    }
}
