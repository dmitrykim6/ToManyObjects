public class ClassZ {
    ClassX linkToX; // Создаем ссылку

    ClassZ(ClassX objX){
        linkToX = objX; // Присваиваем ссылку на объект Х
        System.out.println("I am objZ " + this);
    }
}
