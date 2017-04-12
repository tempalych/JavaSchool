package classwork;

/**
 * Created by artem on 11.04.17.
 */
public class Test2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setGrade(80);
    }
    private static class Employee{
        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            if (grade < 0 || grade > 16)
            {
                throw new IllegalArgumentException("Некорректно задан грейд");
            }
            this.grade = grade;
        }

        private int grade;
    }
}
