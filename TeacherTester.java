package homework18;

public class TeacherTester {
    public static void main(String[] args) {


        MathTeacher mathTeacher=new MathTeacher();

        mathTeacher.name="Jose";
        System.out.println(mathTeacher.name);
        mathTeacher.lastName="Londono";
        mathTeacher.age=35;
        System.out.println(mathTeacher.age);
        mathTeacher.idNumber=4456;
        System.out.println(mathTeacher.idNumber);
        mathTeacher.workAt();
        mathTeacher.favoriteFood();
        mathTeacher.hobby();
        mathTeacher.workLocation();

        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Diana";
        System.out.println(chemistryTeacher.name);
        chemistryTeacher.hobby();
        chemistryTeacher.workLocation();
        chemistryTeacher.workAt();
        chemistryTeacher.favoriteFood();

        PianoTeacher pianoTeacher=new PianoTeacher();
        pianoTeacher.name="Mario";
        pianoTeacher.lastName="Roldan";
        pianoTeacher.hobby();
        pianoTeacher.workAt();
        pianoTeacher.favoriteFood();



}}

//    Teacher teacher = new Teacher();
//PianoTeacher pianoTeacher = new PianoTeacher();
//        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();