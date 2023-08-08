package Project.StarCraft;

public class Medic extends Unit {
    final int maxHp = 60;
    public int healPower;

    public Medic(String name) {
        super(name);
        this.alive = true;
        this.currentHp = maxHp;
        this.healPower = 60;
    }

    public Medic(String name, int x, int y) {
        super(name, x, y);
        this.alive = true;
        this.healPower = 60;
    }

    public int getHealPower() {
        return healPower;
    }

    public void setHealPower(int healPower) {
        this.healPower = healPower;
    }

    public void heal(Marine m) {
        int actualHeal = 2;
        int missingHp = m.maxHp - m.getCurrentHp();

        if (m.getCurrentHp() != m.maxHp) {
            if (this.getHealPower() > 0) {
                while (missingHp > 0 && this.getHealPower() > 0) { // missingHp와 메딕의 힐통 둘 다 체크
                    System.out.println("메딕이 마린의 치료를 시작합니다");
                    m.setCurrentHp(m.getCurrentHp() + actualHeal);
                    this.setHealPower(this.getHealPower() - 1);
                    missingHp -= actualHeal;
                }
            } else {
                System.out.println("마린의 healPower가 부족합니다");
            }
        } else {
            System.out.println("마린의 체력이 가득 찼습니다.");
        }
    }
}
