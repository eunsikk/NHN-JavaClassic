package newgenerics;

public interface Members extends Comparable<Members>{
    // 다양한 객체들을 추가하기위해 인터페이스를 통해 관리
    // Comparable은 정렬을 하기위한 인터페이스
    public int getNo();
    public String getName();
}
