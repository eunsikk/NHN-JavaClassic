package Project.StarCraft;

import Project.StarCraft.attackAble;

public class Marine extends Unit implements attackAble, airAttackable, buildingAttackable {
    final int maxHp = 40;
    private int attackPower = 6;

    public Marine(String name) {
        super(name);
        this.currentHp = maxHp;
        this.getAttackPower();
        // TODO Auto-generated constructor stub
    }

    public Marine(String name, int x, int y) {
        super(name, x, y);
        this.currentHp = maxHp;
        this.getAttackPower();
        // TODO Auto-generated constructor stub
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void groundAttack(Unit g) {
        if (currentHp > 0) {
            System.out.println("지금 지상유닛을 공격중입니다");
        } else {
            super.alive = false;
            super.die();
        }
    }

    public void airAttack(Unit a) {
        if (currentHp > 0) {
            System.out.println("지금 공중유닛을 공격중입니다");
        } else {
            super.alive = false;
            super.die();
        }
    }

    public void buildingAttack(Unit b) {
        if (currentHp > 0) {
            System.out.println("지금 건물을 공격중입니다");
        } else {
            super.alive = false;
            super.die();
        }
    }
}
