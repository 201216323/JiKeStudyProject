package bruce.chang.testlitepal;

import org.litepal.crud.DataSupport;

/**
 * Created by: BruceChang
 * Date on : 2017/4/1.
 * Time on: 16:14
 * Progect_Name:TestLitePal
 * Source Github：
 * Description:
 */

public class Person extends DataSupport{

    private String name;

    private int age;

    private int id;

    private String weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
