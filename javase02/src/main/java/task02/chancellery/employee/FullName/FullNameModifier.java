package task02.chancellery.employee.FullName;

import task02.chancellery.pattern.Modifier;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class FullNameModifier implements Modifier<FullName> {

    private FullName fullName;

    public FullNameModifier(FullName fullName){
        this.fullName = fullName;
    }
    public void modify(FullName object) {
        object = this.fullName;
    }
}