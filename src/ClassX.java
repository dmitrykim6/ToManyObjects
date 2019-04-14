public class ClassX {

    ClassY objY; //Создаем объект Y
    ClassC objC; //Создаем объект C
    ClassZ linkToZ; //Ссылка на объект Z

    ClassX(){

        objY = new ClassY(this); //Передаем объекту Y ссылку на объект X
        objC = new ClassC(objY.objZ, objY); //Передаем объекту С ссылку на объект Z и ссылку на объект Y

        linkToZ = objY.objZ; //Создаем ссылку на объект Z
        System.out.println("I am linkToZ " + linkToZ);
    }
}
