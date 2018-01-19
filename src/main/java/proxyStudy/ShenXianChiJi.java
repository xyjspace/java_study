package proxyStudy;

/**
 * Created by banma on 2018/1/19.
 */
public class ShenXianChiJi implements playChiJi {

    private playChiJi playChiJi;

    ShenXianChiJi(playChiJi playChiJi){
        this.playChiJi = playChiJi;
    }

    public void play() {
        System.out.println("落地九八K，15倍镜，穿墙透视，无后座");
        playChiJi.play();
        System.out.println("咯咯哒，咯咯哒");
    }
}
