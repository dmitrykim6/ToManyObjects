public class ClassT {
    ClassO objO; //Создаем объект O
    ClassY linkToY;
    ClassZ linkToZ3;

    ClassT(ClassZ objZ, ClassY objY){

        objO = new ClassO();
        linkToZ3 = objZ; // Присваиваем ссылку на объект Z
        linkToY = objY; // Присваиваем ссылку на объект Y

        System.out.println("I am linkToZ3 " + linkToZ3);
        System.out.println("I am linkToY " + linkToY);
    }
}
