public class Student
{
    String name;
    int num;

    public Student()
    {
        name = "";
        num = 0;
    }

    public Student(string s, int x)
    {
        name = s;
        num = x;
    }

    public Student(Student s)
    {
        name = s.name;
        num = s.num;
    }
}