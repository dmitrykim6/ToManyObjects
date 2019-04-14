public class ClassY {
    ClassZ objZ; //Создаем объект Z

    ClassY(ClassX objX){
        objZ = new ClassZ(objX); //передаем объекту Z ссылку на объект Х


    }
}
