package javase02.task05.education.subjects;

/**
 * Created by Mao Shaco on 10/18/2015.
 */
public enum Subject {
    mathematics(IntegerMark.class),
    psychology(DoubleMark.class),
    pedagogy(new Mark<Long>().getClass()),
    ideology(DoubleMark.class),
    physicalCulture(IntegerMark.class);

    Subject(Class<? extends Mark> markClass){
        this.markClass = markClass;
    }
    private Class<?> markClass;

    public Class<?> getMarkClass() {
        return markClass;
    }
}
