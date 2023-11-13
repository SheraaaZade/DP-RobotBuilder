public class TankFactory implements AbstractFactory{
    @Override
    public Robot createRobot() {
        return new RobotImpl.RobotBuilder("Tank")
                .puissanceBouclier(3)
                .frequenceTir(60)
                .ptVie(120)
                .puissanceCanon(3)
                .build();
    }
}
