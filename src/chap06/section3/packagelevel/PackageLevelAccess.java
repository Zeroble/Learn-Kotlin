package chap06.section3.packagelevel;

public class PackageLevelAccess {
    public static void main(String[] args) {
//        PackageLevelFunctionKt.packageLevelFunc(); //@file:미사용시
        PKLevel.packageLevelFunc();
    }
}
