package Lessons;

/**
 * Created by Anatoliy on 29.08.2016.
 */
public class Main
{
    public int count = 0;     //�������� ���������� ������

    public void run()
    {
        count = 15;           //��������� � ���������� ������
        int count = 10;       //�������� ��������� ���������� ������
        count ++;             //��������� � ���������� ������
    }

    /*���������� ������ ��������� ����� ���������� ������

    ����������� ���������� ������
    ClassName.variableName

    �������:
    Cat.catsCount

    ������� ���������� ������
    this.variableName

    �������:
    this.catsCount


    ��� �������� ������� ������������� �����:

    ��� �������� ���
    Cat cat = new Cat();
    String name = cat.getName();
    cat.setAge(17);
    cat.setChildren(cat1, cat2, cat3);

    ��� ���������� �� ����� ����
    Cat cat = new Cat();
    String name = Cat.getName(cat);
    Cat.setAge(cat,17);
    Cat.setChildren(cat, cat1, cat2, cat3)


    � ��� ��� �������� ����������� �����:

    ��� �������� ���
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    int catCount = Cat.getAllCatsCount();

    ��� ���������� �� ����� ����
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    int catCount = Cat.getAllCatsCount(null); */
}
