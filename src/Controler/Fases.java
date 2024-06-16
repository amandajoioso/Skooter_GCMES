package Controler;

import java.util.ArrayList;

import Modelo.BlocoEstatico;
import Modelo.BlocoMovivel;
import Modelo.BlocoSeta;
import Modelo.Fruta;
import Modelo.Personagem;
import Modelo.Skoot;
import Modelo.ZigueZague;

public class Fases extends ArrayList<Personagem>{

    public void setFase1(Skoot skoot){
        this.clear();
        this.add(skoot);



        //Blocos
        BlocoEstatico bv1 = new BlocoEstatico("blocoVermelho.png");
        bv1.setPosicao(1, 1);
        this.add(bv1);

        BlocoEstatico bv2 = new BlocoEstatico("blocoVermelho.png");
        bv2.setPosicao(1, 3);
        this.add(bv2);

        BlocoEstatico bv3 = new BlocoEstatico("blocoVermelho.png");
        bv3.setPosicao(1, 5);
        this.add(bv3);

        BlocoEstatico bv4 = new BlocoEstatico("blocoVermelho.png");
        bv4.setPosicao(1, 7);
        this.add(bv4);

        BlocoEstatico bv5 = new BlocoEstatico("blocoVermelho.png");
        bv5.setPosicao(1, 9);
        this.add(bv5);

        BlocoEstatico bv6 = new BlocoEstatico("blocoVermelho.png");
        bv6.setPosicao(3, 1);
        this.add(bv6);

        BlocoEstatico bv7 = new BlocoEstatico("blocoVermelho.png");
        bv7.setPosicao(3, 3);
        this.add(bv7);

        BlocoEstatico bv8 = new BlocoEstatico("blocoVermelho.png");
        bv8.setPosicao(3, 5);
        this.add(bv8);

        BlocoEstatico bv9 = new BlocoEstatico("blocoVermelho.png");
        bv9.setPosicao(3, 7);
        this.add(bv9);

        BlocoEstatico bv10 = new BlocoEstatico("blocoVermelho.png");
        bv10.setPosicao(3, 9);
        this.add(bv10);

        BlocoEstatico bv11 = new BlocoEstatico("blocoVermelho.png");
        bv11.setPosicao(5, 1);
        this.add(bv11);

        BlocoEstatico bv12 = new BlocoEstatico("blocoVermelho.png");
        bv12.setPosicao(5, 3);
        this.add(bv12);

        BlocoEstatico bv13 = new BlocoEstatico("blocoVermelho.png");
        bv13.setPosicao(5, 5);
        this.add(bv13);

        BlocoEstatico bv14 = new BlocoEstatico("blocoVermelho.png");
        bv14.setPosicao(5, 7);
        this.add(bv14);

        BlocoEstatico bv15 = new BlocoEstatico("blocoVermelho.png");
        bv15.setPosicao(5, 9);
        this.add(bv15);

        BlocoEstatico bv16 = new BlocoEstatico("blocoVermelho.png");
        bv16.setPosicao(7, 1);
        this.add(bv16);

        BlocoEstatico bv17 = new BlocoEstatico("blocoVermelho.png");
        bv17.setPosicao(7, 3);
        this.add(bv17);

        BlocoEstatico bv18 = new BlocoEstatico("blocoVermelho.png");
        bv18.setPosicao(7, 5);
        this.add(bv18);

        BlocoEstatico bv19 = new BlocoEstatico("blocoVermelho.png");
        bv19.setPosicao(7, 7);
        this.add(bv19);

        BlocoEstatico bv20 = new BlocoEstatico("blocoVermelho.png");
        bv20.setPosicao(7, 9);
        this.add(bv20);

        BlocoEstatico bv21 = new BlocoEstatico("blocoVermelho.png");
        bv21.setPosicao(9, 1);
        this.add(bv21);

        BlocoEstatico bv22 = new BlocoEstatico("blocoVermelho.png");
        bv22.setPosicao(9, 3);
        this.add(bv22);

        BlocoEstatico bv23 = new BlocoEstatico("blocoVermelho.png");
        bv23.setPosicao(9, 5);
        this.add(bv23);

        BlocoEstatico bv24 = new BlocoEstatico("blocoVermelho.png");
        bv24.setPosicao(9, 7);
        this.add(bv24);

        BlocoEstatico bv25 = new BlocoEstatico("blocoVermelho.png");
        bv25.setPosicao(9, 9);
        this.add(bv25);

        BlocoMovivel bverde1 = new BlocoMovivel("blocoVerde.png");
        bverde1.setPosicao(0, 1);
        this.add(bverde1);

        BlocoMovivel bverde2 = new BlocoMovivel("blocoVerde.png");
        bverde2.setPosicao(0, 5);
        this.add(bverde2);

        BlocoMovivel bverde3 = new BlocoMovivel("blocoVerde.png");
        bverde3.setPosicao(1, 2);
        this.add(bverde3);

        BlocoMovivel bverde4 = new BlocoMovivel("blocoVerde.png");
        bverde4.setPosicao(1, 8);
        this.add(bverde4);

        BlocoMovivel bverde5 = new BlocoMovivel("blocoVerde.png");
        bverde5.setPosicao(1, 10);
        this.add(bverde5);

        BlocoMovivel bverde6 = new BlocoMovivel("blocoVerde.png");
        bverde6.setPosicao(2, 1);
        this.add(bverde6);

        BlocoMovivel bverde7 = new BlocoMovivel("blocoVerde.png");
        bverde7.setPosicao(2, 5);
        this.add(bverde7);

        BlocoMovivel bverde8 = new BlocoMovivel("blocoVerde.png");
        bverde8.setPosicao(3, 0);
        this.add(bverde8);

        BlocoMovivel bverde9 = new BlocoMovivel("blocoVerde.png");
        bverde9.setPosicao(3, 8);
        this.add(bverde9);

        BlocoMovivel bverde10 = new BlocoMovivel("blocoVerde.png");
        bverde10.setPosicao(4, 1);
        this.add(bverde10);

        BlocoMovivel bverde11 = new BlocoMovivel("blocoVerde.png");
        bverde11.setPosicao(4, 9);
        this.add(bverde11);

        BlocoMovivel bverde12 = new BlocoMovivel("blocoVerde.png");
        bverde12.setPosicao(5, 2);
        this.add(bverde12);

        BlocoMovivel bverde13 = new BlocoMovivel("blocoVerde.png");
        bverde13.setPosicao(5, 6);
        this.add(bverde13);

        BlocoMovivel bverde14 = new BlocoMovivel("blocoVerde.png");
        bverde14.setPosicao(6, 5);
        this.add(bverde14);

        BlocoMovivel bverde15 = new BlocoMovivel("blocoVerde.png");
        bverde15.setPosicao(6, 7);
        this.add(bverde15);

        BlocoMovivel bverde16 = new BlocoMovivel("blocoVerde.png");
        bverde16.setPosicao(7, 8);
        this.add(bverde16);

        BlocoMovivel bverde17 = new BlocoMovivel("blocoVerde.png");
        bverde17.setPosicao(7, 10);
        this.add(bverde17);

        BlocoMovivel bverde18 = new BlocoMovivel("blocoVerde.png");
        bverde18.setPosicao(8, 3);
        this.add(bverde18);

        BlocoMovivel bverde19 = new BlocoMovivel("blocoVerde.png");
        bverde19.setPosicao(8, 9);
        this.add(bverde19);

        BlocoMovivel bverde20 = new BlocoMovivel("blocoVerde.png");
        bverde20.setPosicao(9, 0);
        this.add(bverde20);

        BlocoMovivel bverde21 = new BlocoMovivel("blocoVerde.png");
        bverde21.setPosicao(9, 2);
        this.add(bverde21);

        BlocoMovivel bverde22 = new BlocoMovivel("blocoVerde.png");
        bverde22.setPosicao(9, 6);
        this.add(bverde22);

        BlocoMovivel bverde23 = new BlocoMovivel("blocoVerde.png");
        bverde23.setPosicao(9, 8);
        this.add(bverde23);

        BlocoMovivel bverde24 = new BlocoMovivel("blocoVerde.png");
        bverde24.setPosicao(10, 7);
        this.add(bverde24);


        //Personagens
        ZigueZague zz1 = new ZigueZague("roboAmarelo.png");
        zz1.setPosicao(2, 0);
        this.add(zz1);

        ZigueZague zz2 = new ZigueZague("roboRosa.png");
        zz2.setPosicao(0, 9);
        this.add(zz2);

        ZigueZague zz3 = new ZigueZague("roboAzul.png");
        zz3.setPosicao(10, 1);
        this.add(zz3);

        ZigueZague zz4 = new ZigueZague("roboVerde.png");
        zz4.setPosicao(10, 9);
        this.add(zz4);

        //Frutas
        Fruta cereja = new Fruta("cereja.png");
        cereja.setPosicao(10, 10);
        this.add(cereja);

        Fruta maca = new Fruta("maca.png");
        maca.setPosicao(10, 0);
        this.add(maca);

        Fruta uva = new Fruta("uva.png");
        uva.setPosicao(0, 0);
        this.add(uva);

        Fruta limao = new Fruta("limao.png");
        limao.setPosicao(0, 10);
        this.add(limao);
    }

    public void setFase2(Skoot skoot){
        this.clear();
        this.add(skoot);



        //Blocos
        BlocoEstatico bv1 = new BlocoEstatico("blocoVermelho.png");
        bv1.setPosicao(1, 3);
        this.add(bv1);

        BlocoEstatico bv2 = new BlocoEstatico("blocoVermelho.png");
        bv2.setPosicao(1, 7);
        this.add(bv2);

        BlocoEstatico bv3 = new BlocoEstatico("blocoVermelho.png");
        bv3.setPosicao(3, 1);
        this.add(bv3);

        BlocoEstatico bv4 = new BlocoEstatico("blocoVermelho.png");
        bv4.setPosicao(3, 3);
        this.add(bv4);

        BlocoEstatico bv5 = new BlocoEstatico("blocoVermelho.png");
        bv5.setPosicao(3, 5);
        this.add(bv5);

        BlocoEstatico bv6 = new BlocoEstatico("blocoVermelho.png");
        bv6.setPosicao(3, 7);
        this.add(bv6);

        BlocoEstatico bv7 = new BlocoEstatico("blocoVermelho.png");
        bv7.setPosicao(3, 9);
        this.add(bv7);

        BlocoEstatico bv8 = new BlocoEstatico("blocoVermelho.png");
        bv8.setPosicao(5, 3);
        this.add(bv8);

        BlocoEstatico bv9 = new BlocoEstatico("blocoVermelho.png");
        bv9.setPosicao(5, 7);
        this.add(bv9);

        BlocoEstatico bv10 = new BlocoEstatico("blocoVermelho.png");
        bv10.setPosicao(7, 1);
        this.add(bv10);

        BlocoEstatico bv11 = new BlocoEstatico("blocoVermelho.png");
        bv11.setPosicao(7, 3);
        this.add(bv11);

        BlocoEstatico bv12 = new BlocoEstatico("blocoVermelho.png");
        bv12.setPosicao(7, 5);
        this.add(bv12);

        BlocoEstatico bv13 = new BlocoEstatico("blocoVermelho.png");
        bv13.setPosicao(7, 7);
        this.add(bv13);

        BlocoEstatico bv14 = new BlocoEstatico("blocoVermelho.png");
        bv14.setPosicao(7, 9);
        this.add(bv14);

        BlocoEstatico bv15 = new BlocoEstatico("blocoVermelho.png");
        bv15.setPosicao(9, 3);
        this.add(bv15);

        BlocoEstatico bv16 = new BlocoEstatico("blocoVermelho.png");
        bv16.setPosicao(9, 7);
        this.add(bv16);


        //setas UP
        BlocoSeta up1 = new BlocoSeta("up.png");
        up1.setPosicao(3, 0);
        this.add(up1);

        BlocoSeta up2 = new BlocoSeta("up.png");
        up2.setPosicao(3, 6);
        this.add(up2);

        BlocoSeta up3 = new BlocoSeta("up.png");
        up3.setPosicao(3, 8);
        this.add(up3);

        BlocoSeta up4 = new BlocoSeta("up.png");
        up4.setPosicao(4, 0);
        this.add(up4);

        BlocoSeta up5 = new BlocoSeta("up.png");
        up5.setPosicao(4, 8);
        this.add(up5);

        BlocoSeta up6 = new BlocoSeta("up.png");
        up6.setPosicao(5, 0);
        this.add(up6);

        BlocoSeta up7 = new BlocoSeta("up.png");
        up7.setPosicao(6, 0);
        this.add(up7);

        BlocoSeta up8 = new BlocoSeta("up.png");
        up8.setPosicao(7, 0);
        this.add(up8);

        BlocoSeta up9 = new BlocoSeta("up.png");
        up9.setPosicao(7, 6);
        this.add(up9);

        BlocoSeta up10 = new BlocoSeta("up.png");
        up10.setPosicao(7, 8);
        this.add(up10);

        BlocoSeta up11 = new BlocoSeta("up.png");
        up11.setPosicao(7, 10);
        this.add(up11);


        // setas DOWN
        BlocoSeta down1 = new BlocoSeta("down.png");
        down1.setPosicao(2, 4);
        this.add(down1);

        BlocoSeta down2 = new BlocoSeta("down.png");
        down2.setPosicao(3, 2);
        this.add(down2);

        BlocoSeta down3 = new BlocoSeta("down.png");
        down3.setPosicao(3, 4);
        this.add(down3);

        BlocoSeta down4 = new BlocoSeta("down.png");
        down4.setPosicao(3, 10);
        this.add(down4);

        BlocoSeta down5 = new BlocoSeta("down.png");
        down5.setPosicao(7, 2);
        this.add(down5);

        BlocoSeta down6 = new BlocoSeta("down.png");
        down6.setPosicao(7, 4);
        this.add(down6);



        // setas RIGHT
        BlocoSeta right1 = new BlocoSeta("right.png");
        right1.setPosicao(0, 3);
        this.add(right1);

        BlocoSeta right2 = new BlocoSeta("right.png");
        right2.setPosicao(0, 7);
        this.add(right2);

        BlocoSeta right3 = new BlocoSeta("right.png");
        right3.setPosicao(2, 3);
        this.add(right3);

        BlocoSeta right4 = new BlocoSeta("right.png");
        right4.setPosicao(4, 3);
        this.add(right4);

        BlocoSeta right5 = new BlocoSeta("right.png");
        right5.setPosicao(4, 7);
        this.add(right5);

        BlocoSeta right6 = new BlocoSeta("right.png");
        right6.setPosicao(6, 3);
        this.add(right6);

        BlocoSeta rigth7 = new BlocoSeta("right.png");
        rigth7.setPosicao(8, 3);
        this.add(rigth7);

        BlocoSeta right8 = new BlocoSeta("right.png");
        right8.setPosicao(8, 7);
        this.add(right8);

        BlocoSeta right9 = new BlocoSeta("right.png");
        right9.setPosicao(10, 7);
        this.add(right9);


        // setas LEFT
        BlocoSeta left1 = new BlocoSeta("left.png");
        left1.setPosicao(2, 5);
        this.add(left1);

        BlocoSeta left2 = new BlocoSeta("left.png");
        left2.setPosicao(2, 6);
        this.add(left2);

        BlocoSeta left3 = new BlocoSeta("left.png");
        left3.setPosicao(2, 7);
        this.add(left3);

        BlocoSeta left4 = new BlocoSeta("left.png");
        left4.setPosicao(4, 9);
        this.add(left4);

        BlocoSeta left5 = new BlocoSeta("left.png");
        left5.setPosicao(4, 10);
        this.add(left5);

        BlocoSeta left6 = new BlocoSeta("left.png");
        left6.setPosicao(6, 7);
        this.add(left6);

        BlocoSeta left7 = new BlocoSeta("left.png");
        left7.setPosicao(10, 3);
        this.add(left7);



        //Personagens
        ZigueZague zz1 = new ZigueZague("roboAmarelo.png");
        zz1.setPosicao(1, 1);
        this.add(zz1);

        ZigueZague zz2 = new ZigueZague("roboRosa.png");
        zz2.setPosicao(9, 1);
        this.add(zz2);

        ZigueZague zz3 = new ZigueZague("roboVerde.png");
        zz3.setPosicao(1, 9);
        this.add(zz3);

        ZigueZague zz4 = new ZigueZague("roboAzul.png");
        zz4.setPosicao(9, 9);
        this.add(zz4);

        //Frutas
        Fruta cereja = new Fruta("cereja.png");
        cereja.setPosicao(9, 5);
        this.add(cereja);

        Fruta maca = new Fruta("maca.png");
        maca.setPosicao(5, 9);
        this.add(maca);

        Fruta uva = new Fruta("uva.png");
        uva.setPosicao(1, 5);
        this.add(uva);

        Fruta limao = new Fruta("limao.png");
        limao.setPosicao(5, 1);
        this.add(limao);
    }


    public void setFase3(Skoot skoot){
        this.clear();
        this.add(skoot);



        //Blocos
        BlocoMovivel bVermelhoM1 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM1.setPosicao(1, 1);
        this.add(bVermelhoM1);

        BlocoMovivel bVermelhoM2 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM2.setPosicao(1, 2);
        this.add(bVermelhoM2);

        BlocoMovivel bVermelhoM3 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM3.setPosicao(1, 3);
        this.add(bVermelhoM3);

        BlocoMovivel bVermelhoM4 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM4.setPosicao(1, 4);
        this.add(bVermelhoM4);

        BlocoMovivel bVermelhoM5 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM5.setPosicao(1, 5);
        this.add(bVermelhoM5);

        BlocoMovivel bVermelhoM6 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM6.setPosicao(1, 6);
        this.add(bVermelhoM6);

        BlocoMovivel bVermelhoM7 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM7.setPosicao(1, 7);
        this.add(bVermelhoM7);

        BlocoMovivel bVermelhoM8 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM8.setPosicao(1, 8);
        this.add(bVermelhoM8);

        BlocoMovivel bVermelhoM9 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM9.setPosicao(1, 9);
        this.add(bVermelhoM9);

        BlocoMovivel bVermelhoM10 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM10.setPosicao(2, 1);
        this.add(bVermelhoM10);

        BlocoMovivel bVermelhoM11 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM11.setPosicao(2, 9);
        this.add(bVermelhoM11);

        BlocoMovivel bVermelhoM12 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM12.setPosicao(3, 1);
        this.add(bVermelhoM12);

        BlocoMovivel bVermelhoM13 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM13.setPosicao(3, 3);
        this.add(bVermelhoM13);

        BlocoMovivel bVermelhoM14 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM14.setPosicao(3, 4);
        this.add(bVermelhoM14);

        BlocoMovivel bVermelhoM15 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM15.setPosicao(3, 5);
        this.add(bVermelhoM15);

        BlocoMovivel bVermelhoM16 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM16.setPosicao(3, 6);
        this.add(bVermelhoM16);

        BlocoMovivel bVermelhoM17 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM17.setPosicao(3, 7);
        this.add(bVermelhoM17);

        BlocoMovivel bVermelhoM18 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM18.setPosicao(3, 9);
        this.add(bVermelhoM18);

        BlocoMovivel bVermelhoM19 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM19.setPosicao(4, 1);
        this.add(bVermelhoM19);

        BlocoMovivel bVermelhoM20 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM20.setPosicao(4, 3);
        this.add(bVermelhoM20);

        BlocoMovivel bVermelhoM21 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM21.setPosicao(4, 7);
        this.add(bVermelhoM21);

        BlocoMovivel bVermelhoM22 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM22.setPosicao(4, 9);
        this.add(bVermelhoM22);

        BlocoMovivel bVermelhoM23 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM23.setPosicao(5, 1);
        this.add(bVermelhoM23);

        BlocoMovivel bVermelhoM24 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM24.setPosicao(5, 3);
        this.add(bVermelhoM24);

        BlocoMovivel bVermelhoM25 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM25.setPosicao(5, 7);
        this.add(bVermelhoM25);

        BlocoMovivel bVermelhoM26 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM26.setPosicao(5, 9);
        this.add(bVermelhoM26);

        BlocoMovivel bVermelhoM27 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM27.setPosicao(6, 1);
        this.add(bVermelhoM27);

        BlocoMovivel bVermelhoM28 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM28.setPosicao(6, 3);
        this.add(bVermelhoM28);

        BlocoMovivel bVermelhoM29 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM29.setPosicao(6, 7);
        this.add(bVermelhoM29);

        BlocoMovivel bVermelhoM30 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM30.setPosicao(6, 9);
        this.add(bVermelhoM30);

        BlocoMovivel bVermelhoM31 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM31.setPosicao(7, 1);
        this.add(bVermelhoM31);

        BlocoMovivel bVermelhoM32 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM32.setPosicao(7, 3);
        this.add(bVermelhoM32);

        BlocoMovivel bVermelhoM46 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM46.setPosicao(7, 4);
        this.add(bVermelhoM46);

        BlocoMovivel bVermelhoM47 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM47.setPosicao(7, 5);
        this.add(bVermelhoM47);

        BlocoMovivel bVermelhoM48 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM48.setPosicao(7, 6);
        this.add(bVermelhoM48);

        BlocoMovivel bVermelhoM33 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM33.setPosicao(7, 7);
        this.add(bVermelhoM33);

        BlocoMovivel bVermelhoM34 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM34.setPosicao(7, 9);
        this.add(bVermelhoM34);

        BlocoMovivel bVermelhoM35 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM35.setPosicao(8, 1);
        this.add(bVermelhoM35);

        BlocoMovivel bVermelhoM36 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM36.setPosicao(8, 9);
        this.add(bVermelhoM36);

        BlocoMovivel bVermelhoM37 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM37.setPosicao(9, 1);
        this.add(bVermelhoM37);

        BlocoMovivel bVermelhoM38 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM38.setPosicao(9, 2);
        this.add(bVermelhoM38);

        BlocoMovivel bVermelhoM39 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM39.setPosicao(9, 3);
        this.add(bVermelhoM39);

        BlocoMovivel bVermelhoM40 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM40.setPosicao(9, 4);
        this.add(bVermelhoM40);

        BlocoMovivel bVermelhoM41 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM41.setPosicao(9, 5);
        this.add(bVermelhoM41);

        BlocoMovivel bVermelhoM42 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM42.setPosicao(9, 6);
        this.add(bVermelhoM42);

        BlocoMovivel bVermelhoM43 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM43.setPosicao(9, 7);
        this.add(bVermelhoM43);

        BlocoMovivel bVermelhoM44 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM44.setPosicao(9, 8);
        this.add(bVermelhoM44);

        BlocoMovivel bVermelhoM45 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bVermelhoM45.setPosicao(9, 9);
        this.add(bVermelhoM45);



        //Personagens
        ZigueZague zz1 = new ZigueZague("roboAmarelo.png");
        zz1.setPosicao(0, 5);
        this.add(zz1);

        ZigueZague zz2 = new ZigueZague("roboRosa.png");
        zz2.setPosicao(2, 5);
        this.add(zz2);

        ZigueZague zz3 = new ZigueZague("roboAzul.png");
        zz3.setPosicao(8, 5);
        this.add(zz3);

        ZigueZague zz4 = new ZigueZague("roboVerde.png");
        zz4.setPosicao(10, 5);
        this.add(zz4);

        //Frutas
        Fruta sol = new Fruta("sol.png");
        sol.setPosicao(5, 0);
        this.add(sol);

        Fruta vela = new Fruta("vela.png");
        vela.setPosicao(5, 2);
        this.add(vela);

        Fruta lampada = new Fruta("lampada.png");
        lampada.setPosicao(5, 8);
        this.add(lampada);

        Fruta lanterna = new Fruta("lanterna.png");
        lanterna.setPosicao(5, 10);
        this.add(lanterna);
    }


    public void setFase4(Skoot skoot){
        this.clear();
        this.add(skoot);


        //Blocos verdes moviveis
        BlocoMovivel bverde1 = new BlocoMovivel("blocoVerde.png");
        bverde1.setPosicao(1, 1);
        this.add(bverde1);

        BlocoMovivel bverde2 = new BlocoMovivel("blocoVerde.png");
        bverde2.setPosicao(1, 3);
        this.add(bverde2);

        BlocoMovivel bverde3 = new BlocoMovivel("blocoVerde.png");
        bverde3.setPosicao(1, 5);
        this.add(bverde3);

        BlocoMovivel bverde4 = new BlocoMovivel("blocoVerde.png");
        bverde4.setPosicao(1, 7);
        this.add(bverde4);

        BlocoMovivel bverde5 = new BlocoMovivel("blocoVerde.png");
        bverde5.setPosicao(1, 9);
        this.add(bverde5);

        BlocoMovivel bverde6 = new BlocoMovivel("blocoVerde.png");
        bverde6.setPosicao(2, 2);
        this.add(bverde6);

        BlocoMovivel bverde7 = new BlocoMovivel("blocoVerde.png");
        bverde7.setPosicao(2, 4);
        this.add(bverde7);

        BlocoMovivel bverde8 = new BlocoMovivel("blocoVerde.png");
        bverde8.setPosicao(2, 6);
        this.add(bverde8);

        BlocoMovivel bverde9 = new BlocoMovivel("blocoVerde.png");
        bverde9.setPosicao(2, 8);
        this.add(bverde9);

        BlocoMovivel bverde10 = new BlocoMovivel("blocoVerde.png");
        bverde10.setPosicao(3, 1);
        this.add(bverde10);

        BlocoMovivel bverde11 = new BlocoMovivel("blocoVerde.png");
        bverde11.setPosicao(3, 3);
        this.add(bverde11);

        BlocoMovivel bverde12 = new BlocoMovivel("blocoVerde.png");
        bverde12.setPosicao(3, 5);
        this.add(bverde12);

        BlocoMovivel bverde13 = new BlocoMovivel("blocoVerde.png");
        bverde13.setPosicao(3, 7);
        this.add(bverde13);

        BlocoMovivel bverde14 = new BlocoMovivel("blocoVerde.png");
        bverde14.setPosicao(3, 9);
        this.add(bverde14);

        BlocoMovivel bverde15 = new BlocoMovivel("blocoVerde.png");
        bverde15.setPosicao(4, 2);
        this.add(bverde15);

        BlocoMovivel bverde16 = new BlocoMovivel("blocoVerde.png");
        bverde16.setPosicao(4, 4);
        this.add(bverde16);

        BlocoMovivel bverde17 = new BlocoMovivel("blocoVerde.png");
        bverde17.setPosicao(4, 6);
        this.add(bverde17);

        BlocoMovivel bverde18 = new BlocoMovivel("blocoVerde.png");
        bverde18.setPosicao(4, 8);
        this.add(bverde18);

        BlocoMovivel bverde19 = new BlocoMovivel("blocoVerde.png");
        bverde19.setPosicao(5, 1);
        this.add(bverde19);

        BlocoMovivel bverde20 = new BlocoMovivel("blocoVerde.png");
        bverde20.setPosicao(5, 3);
        this.add(bverde20);

        BlocoMovivel bverde21 = new BlocoMovivel("blocoVerde.png");
        bverde21.setPosicao(5, 7);
        this.add(bverde21);

        BlocoMovivel bverde22 = new BlocoMovivel("blocoVerde.png");
        bverde22.setPosicao(5, 9);
        this.add(bverde22);

        BlocoMovivel bverde23 = new BlocoMovivel("blocoVerde.png");
        bverde23.setPosicao(6, 2);
        this.add(bverde23);

        BlocoMovivel bverde24 = new BlocoMovivel("blocoVerde.png");
        bverde24.setPosicao(6, 4);
        this.add(bverde24);

        BlocoMovivel bverde25 = new BlocoMovivel("blocoVerde.png");
        bverde25.setPosicao(6, 6);
        this.add(bverde25);

        BlocoMovivel bverde26 = new BlocoMovivel("blocoVerde.png");
        bverde26.setPosicao(6, 8);
        this.add(bverde26);

        BlocoMovivel bverde27 = new BlocoMovivel("blocoVerde.png");
        bverde27.setPosicao(7, 1);
        this.add(bverde27);

        BlocoMovivel bverde28 = new BlocoMovivel("blocoVerde.png");
        bverde28.setPosicao(7, 3);
        this.add(bverde28);

        BlocoMovivel bverde29 = new BlocoMovivel("blocoVerde.png");
        bverde29.setPosicao(7, 5);
        this.add(bverde29);

        BlocoMovivel bverde30 = new BlocoMovivel("blocoVerde.png");
        bverde30.setPosicao(7, 7);
        this.add(bverde30);

        BlocoMovivel bverde31 = new BlocoMovivel("blocoVerde.png");
        bverde31.setPosicao(7, 9);
        this.add(bverde31);

        BlocoMovivel bverde32 = new BlocoMovivel("blocoVerde.png");
        bverde32.setPosicao(8, 2);
        this.add(bverde32);

        BlocoMovivel bverde33 = new BlocoMovivel("blocoVerde.png");
        bverde33.setPosicao(8, 4);
        this.add(bverde33);

        BlocoMovivel bverde34 = new BlocoMovivel("blocoVerde.png");
        bverde34.setPosicao(8, 6);
        this.add(bverde34);

        BlocoMovivel bverde35 = new BlocoMovivel("blocoVerde.png");
        bverde35.setPosicao(8, 8);
        this.add(bverde35);

        BlocoMovivel bverde36 = new BlocoMovivel("blocoVerde.png");
        bverde36.setPosicao(9, 1);
        this.add(bverde36);

        BlocoMovivel bverde37 = new BlocoMovivel("blocoVerde.png");
        bverde37.setPosicao(9, 3);
        this.add(bverde37);

        BlocoMovivel bverde38 = new BlocoMovivel("blocoVerde.png");
        bverde38.setPosicao(9, 5);
        this.add(bverde38);

        BlocoMovivel bverde39 = new BlocoMovivel("blocoVerde.png");
        bverde39.setPosicao(9, 7);
        this.add(bverde39);

        BlocoMovivel bverde40 = new BlocoMovivel("blocoVerde.png");
        bverde40.setPosicao(9, 9);
        this.add(bverde40);


        //Bloco vermelho
        BlocoEstatico bv1 = new BlocoEstatico("blocoVermelho.png");
        bv1.setPosicao(0, 3);
        this.add(bv1);

        BlocoEstatico bv2 = new BlocoEstatico("blocoVermelho.png");
        bv2.setPosicao(0, 7);
        this.add(bv2);

        BlocoEstatico bv3 = new BlocoEstatico("blocoVermelho.png");
        bv3.setPosicao(1, 0);
        this.add(bv3);

        BlocoEstatico bv4 = new BlocoEstatico("blocoVermelho.png");
        bv4.setPosicao(1, 8);
        this.add(bv4);

        BlocoEstatico bv5 = new BlocoEstatico("blocoVermelho.png");
        bv5.setPosicao(2, 5);
        this.add(bv5);

        BlocoEstatico bv6 = new BlocoEstatico("blocoVermelho.png");
        bv6.setPosicao(3, 2);
        this.add(bv6);

        BlocoEstatico bv7 = new BlocoEstatico("blocoVermelho.png");
        bv7.setPosicao(3, 10);
        this.add(bv7);

        BlocoEstatico bv8 = new BlocoEstatico("blocoVermelho.png");
        bv8.setPosicao(5, 2);
        this.add(bv8);

        BlocoEstatico bv9 = new BlocoEstatico("blocoVermelho.png");
        bv9.setPosicao(5, 8);
        this.add(bv9);

        BlocoEstatico bv10 = new BlocoEstatico("blocoVermelho.png");
        bv10.setPosicao(6, 3);
        this.add(bv10);

        BlocoEstatico bv11 = new BlocoEstatico("blocoVermelho.png");
        bv11.setPosicao(7, 0);
        this.add(bv11);

        BlocoEstatico bv12 = new BlocoEstatico("blocoVermelho.png");
        bv12.setPosicao(8, 1);
        this.add(bv12);

        BlocoEstatico bv13 = new BlocoEstatico("blocoVermelho.png");
        bv13.setPosicao(8, 7);
        this.add(bv13);

        BlocoEstatico bv14 = new BlocoEstatico("blocoVermelho.png");
        bv14.setPosicao(8, 10);
        this.add(bv14);

        BlocoEstatico bv15 = new BlocoEstatico("blocoVermelho.png");
        bv15.setPosicao(10, 1);
        this.add(bv15);


        //Personagens
        ZigueZague zz1 = new ZigueZague("roboAmarelo.png");
        zz1.setPosicao(0, 5);
        this.add(zz1);

        ZigueZague zz2 = new ZigueZague("roboRosa.png");
        zz2.setPosicao(10, 5);
        this.add(zz2);

        ZigueZague zz3 = new ZigueZague("roboAzul.png");
        zz3.setPosicao(5, 10);
        this.add(zz3);

        ZigueZague zz4 = new ZigueZague("roboVerde.png");
        zz4.setPosicao(5, 0);
        this.add(zz4);


        //Frutas
        Fruta sol = new Fruta("sol.png");
        sol.setPosicao(0, 0);
        this.add(sol);

        Fruta lampada = new Fruta("lampada.png");
        lampada.setPosicao(0, 10);
        this.add(lampada);

        Fruta vela = new Fruta("vela.png");
        vela.setPosicao(9, 0);
        this.add(vela);

        Fruta lanterna = new Fruta("lanterna.png");
        lanterna.setPosicao(9, 10);
        this.add(lanterna);

    }


    public void setFase5(Skoot skoot){
        this.clear();
        this.add(skoot);

        for(int i = 0; i < 11; i++){
            BlocoMovivel bverde1 = new BlocoMovivel("blocoVerde.png");
            bverde1.setPosicao(0, i);
            this.add(bverde1);
        }

        BlocoMovivel bverde2 = new BlocoMovivel("blocoVerde.png");
        bverde2.setPosicao(1, 0);
        this.add(bverde2);

        BlocoMovivel bverde3 = new BlocoMovivel("blocoVerde.png");
        bverde3.setPosicao(1, 2);
        this.add(bverde3);

        BlocoMovivel bverde4 = new BlocoMovivel("blocoVerde.png");
        bverde4.setPosicao(1, 3);
        this.add(bverde4);

        BlocoMovivel bverde5 = new BlocoMovivel("blocoVerde.png");
        bverde5.setPosicao(1, 4);
        this.add(bverde5);

        BlocoMovivel bverde6 = new BlocoMovivel("blocoVerde.png");
        bverde6.setPosicao(1, 5);
        this.add(bverde6);

        BlocoMovivel bverde7 = new BlocoMovivel("blocoVerde.png");
        bverde7.setPosicao(1, 7);
        this.add(bverde7);

        BlocoMovivel bverde8 = new BlocoMovivel("blocoVerde.png");
        bverde8.setPosicao(1, 8);
        this.add(bverde8);

        BlocoMovivel bverde9 = new BlocoMovivel("blocoVerde.png");
        bverde9.setPosicao(1, 9);
        this.add(bverde9);

        BlocoMovivel bverde10 = new BlocoMovivel("blocoVerde.png");
        bverde10.setPosicao(2, 0);
        this.add(bverde10);

        BlocoMovivel bverde11 = new BlocoMovivel("blocoVerde.png");
        bverde11.setPosicao(2, 2);
        this.add(bverde11);

        BlocoMovivel bverde12 = new BlocoMovivel("blocoVerde.png");
        bverde12.setPosicao(2, 3);
        this.add(bverde12);

        BlocoMovivel bverde13 = new BlocoMovivel("blocoVerde.png");
        bverde13.setPosicao(2, 4);
        this.add(bverde13);

        BlocoMovivel bverde14 = new BlocoMovivel("blocoVerde.png");
        bverde14.setPosicao(2, 5);
        this.add(bverde14);

        BlocoMovivel bverde15 = new BlocoMovivel("blocoVerde.png");
        bverde15.setPosicao(2, 6);
        this.add(bverde15);

        BlocoMovivel bverde16 = new BlocoMovivel("blocoVerde.png");
        bverde16.setPosicao(2, 8);
        this.add(bverde16);

        BlocoMovivel bverde17 = new BlocoMovivel("blocoVerde.png");
        bverde17.setPosicao(2, 9);
        this.add(bverde17);

        BlocoMovivel bverde18 = new BlocoMovivel("blocoVerde.png");
        bverde18.setPosicao(2, 10);
        this.add(bverde18);

        BlocoMovivel bverde19 = new BlocoMovivel("blocoVerde.png");
        bverde19.setPosicao(1, 10);
        this.add(bverde19);

        BlocoMovivel bverde20 = new BlocoMovivel("blocoVerde.png");
        bverde20.setPosicao(3, 0);
        this.add(bverde20);

        BlocoMovivel bverde21 = new BlocoMovivel("blocoVerde.png");
        bverde21.setPosicao(3, 1);
        this.add(bverde21);

        BlocoMovivel bverde22 = new BlocoMovivel("blocoVerde.png");
        bverde22.setPosicao(3, 2);
        this.add(bverde22);

        BlocoMovivel bverde23 = new BlocoMovivel("blocoVerde.png");
        bverde23.setPosicao(3, 6);
        this.add(bverde23);

        BlocoMovivel bverde24 = new BlocoMovivel("blocoVerde.png");
        bverde24.setPosicao(3, 8);
        this.add(bverde24);


        BlocoMovivel bverde25 = new BlocoMovivel("blocoVerde.png");
        bverde25.setPosicao(3, 9);
        this.add(bverde25);

        BlocoMovivel bverde26 = new BlocoMovivel("blocoVerde.png");
        bverde26.setPosicao(3, 10);
        this.add(bverde26);

        BlocoMovivel bverde27 = new BlocoMovivel("blocoVerde.png");
        bverde27.setPosicao(4, 0);
        this.add(bverde27);

        BlocoMovivel bverde28 = new BlocoMovivel("blocoVerde.png");
        bverde28.setPosicao(4, 1);
        this.add(bverde28);

        BlocoMovivel bverde29 = new BlocoMovivel("blocoVerde.png");
        bverde29.setPosicao(4, 2);
        this.add(bverde29);

        BlocoMovivel bverde30 = new BlocoMovivel("blocoVerde.png");
        bverde30.setPosicao(4, 6);
        this.add(bverde30);

        BlocoMovivel bverde31 = new BlocoMovivel("blocoVerde.png");
        bverde31.setPosicao(4, 9);
        this.add(bverde31);

        BlocoMovivel bverde32 = new BlocoMovivel("blocoVerde.png");
        bverde32.setPosicao(4, 10);
        this.add(bverde32);

        BlocoMovivel bverde33 = new BlocoMovivel("blocoVerde.png");
        bverde33.setPosicao(5, 0);
        this.add(bverde33);

        BlocoMovivel bverde34 = new BlocoMovivel("blocoVerde.png");
        bverde34.setPosicao(5, 1);
        this.add(bverde34);

        BlocoMovivel bverde35 = new BlocoMovivel("blocoVerde.png");
        bverde35.setPosicao(5, 2);
        this.add(bverde35);

        BlocoMovivel bverde36 = new BlocoMovivel("blocoVerde.png");
        bverde36.setPosicao(5, 6);
        this.add(bverde36);

        BlocoMovivel bverde37 = new BlocoMovivel("blocoVerde.png");
        bverde37.setPosicao(5, 7);
        this.add(bverde37);

        BlocoMovivel bverde38 = new BlocoMovivel("blocoVerde.png");
        bverde38.setPosicao(5, 8);
        this.add(bverde38);

        BlocoMovivel bverde39 = new BlocoMovivel("blocoVerde.png");
        bverde39.setPosicao(5, 9);
        this.add(bverde39);

        BlocoMovivel bverde40 = new BlocoMovivel("blocoVerde.png");
        bverde40.setPosicao(5, 10);
        this.add(bverde40);

        BlocoMovivel bverde41 = new BlocoMovivel("blocoVerde.png");
        bverde41.setPosicao(6, 0);
        this.add(bverde41);

        BlocoMovivel bverde42 = new BlocoMovivel("blocoVerde.png");
        bverde42.setPosicao(6, 2);
        this.add(bverde42);

        BlocoMovivel bverde43 = new BlocoMovivel("blocoVerde.png");
        bverde43.setPosicao(6, 3);
        this.add(bverde43);

        BlocoMovivel bverde44 = new BlocoMovivel("blocoVerde.png");
        bverde44.setPosicao(6, 4);
        this.add(bverde44);

        BlocoMovivel bverde45 = new BlocoMovivel("blocoVerde.png");
        bverde45.setPosicao(6, 5);
        this.add(bverde45);

        BlocoMovivel bverde46 = new BlocoMovivel("blocoVerde.png");
        bverde46.setPosicao(6, 6);
        this.add(bverde46);

        BlocoMovivel bverde47 = new BlocoMovivel("blocoVerde.png");
        bverde47.setPosicao(6, 7);
        this.add(bverde47);

        BlocoMovivel bverde48 = new BlocoMovivel("blocoVerde.png");
        bverde48.setPosicao(6, 9);
        this.add(bverde48);

        BlocoMovivel bverde49 = new BlocoMovivel("blocoVerde.png");
        bverde49.setPosicao(7, 0);
        this.add(bverde49);


        BlocoMovivel bverde50 = new BlocoMovivel("blocoVerde.png");
        bverde50.setPosicao(7, 3);
        this.add(bverde50);

        BlocoMovivel bverde51 = new BlocoMovivel("blocoVerde.png");
        bverde51.setPosicao(7, 4);
        this.add(bverde51);

        BlocoMovivel bverde52 = new BlocoMovivel("blocoVerde.png");
        bverde52.setPosicao(7, 5);
        this.add(bverde52);

        BlocoMovivel bverde53 = new BlocoMovivel("blocoVerde.png");
        bverde53.setPosicao(7, 6);
        this.add(bverde53);

        BlocoMovivel bverde54 = new BlocoMovivel("blocoVerde.png");
        bverde54.setPosicao(7, 7);
        this.add(bverde54);

        BlocoMovivel bverde55 = new BlocoMovivel("blocoVerde.png");
        bverde55.setPosicao(7, 9);
        this.add(bverde55);

        BlocoMovivel bverde56 = new BlocoMovivel("blocoVerde.png");
        bverde56.setPosicao(8, 2);
        this.add(bverde56);

        BlocoMovivel bverde57 = new BlocoMovivel("blocoVerde.png");
        bverde57.setPosicao(8, 3);
        this.add(bverde57);

        BlocoMovivel bverde58 = new BlocoMovivel("blocoVerde.png");
        bverde58.setPosicao(8, 6);
        this.add(bverde58);

        BlocoMovivel bverde59 = new BlocoMovivel("blocoVerde.png");
        bverde59.setPosicao(8, 8);
        this.add(bverde59);

        BlocoMovivel bverde60 = new BlocoMovivel("blocoVerde.png");
        bverde60.setPosicao(9, 0);
        this.add(bverde60);

        BlocoMovivel bverde61 = new BlocoMovivel("blocoVerde.png");
        bverde61.setPosicao(9, 1);
        this.add(bverde61);

        BlocoMovivel bverde62 = new BlocoMovivel("blocoVerde.png");
        bverde62.setPosicao(9, 2);
        this.add(bverde62);

        BlocoMovivel bverde63 = new BlocoMovivel("blocoVerde.png");
        bverde63.setPosicao(9, 4);
        this.add(bverde63);

        BlocoMovivel bverde64 = new BlocoMovivel("blocoVerde.png");
        bverde64.setPosicao(9, 5);
        this.add(bverde64);

        BlocoMovivel bverde65 = new BlocoMovivel("blocoVerde.png");
        bverde65.setPosicao(9, 8);
        this.add(bverde65);

        BlocoMovivel bverde66 = new BlocoMovivel("blocoVerde.png");
        bverde66.setPosicao(9, 9);
        this.add(bverde66);

        BlocoMovivel bverde67 = new BlocoMovivel("blocoVerde.png");
        bverde67.setPosicao(9, 10);
        this.add(bverde67);

        BlocoMovivel bverde68 = new BlocoMovivel("blocoVerde.png");
        bverde68.setPosicao(10, 0);
        this.add(bverde68);

        BlocoMovivel bverde69 = new BlocoMovivel("blocoVerde.png");
        bverde69.setPosicao(10, 1);
        this.add(bverde69);

        BlocoMovivel bverde70 = new BlocoMovivel("blocoVerde.png");
        bverde70.setPosicao(10, 2);
        this.add(bverde70);

        BlocoMovivel bverde71 = new BlocoMovivel("blocoVerde.png");
        bverde71.setPosicao(10, 5);
        this.add(bverde71);

        BlocoMovivel bverde72 = new BlocoMovivel("blocoVerde.png");
        bverde72.setPosicao(10, 6);
        this.add(bverde72);

        BlocoMovivel bverde73 = new BlocoMovivel("blocoVerde.png");
        bverde73.setPosicao(10, 9);
        this.add(bverde73);

        BlocoMovivel bve1 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bve1.setPosicao(2, 7);
        this.add(bve1);

        BlocoMovivel bve2 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bve2.setPosicao(3, 7);
        this.add(bve2);

        BlocoMovivel bve3 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bve3.setPosicao(4, 7);
        this.add(bve3);

        BlocoMovivel bve4 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bve4.setPosicao(4, 8);
        this.add(bve4);

        BlocoMovivel bve5 = new BlocoMovivel("blocoVermelhoArrastavel.png");
        bve5.setPosicao(8, 0);
        this.add(bve5);

        BlocoEstatico bv1 = new BlocoEstatico("blocoVermelho.png");
        bv1.setPosicao(1, 6);
        this.add(bv1);

        BlocoEstatico bv2 = new BlocoEstatico("blocoVermelho.png");
        bv2.setPosicao(2, 1);
        this.add(bv2);

        BlocoEstatico bv3 = new BlocoEstatico("blocoVermelho.png");
        bv3.setPosicao(3, 9);
        this.add(bv3);

        BlocoEstatico bv4 = new BlocoEstatico("blocoVermelho.png");
        bv4.setPosicao(3, 10);
        this.add(bv4);

        BlocoEstatico bv5 = new BlocoEstatico("blocoVermelho.png");
        bv5.setPosicao(6, 1);
        this.add(bv5);

        BlocoEstatico bv6 = new BlocoEstatico("blocoVermelho.png");
        bv6.setPosicao(6, 10);
        this.add(bv6);

        BlocoEstatico bv7 = new BlocoEstatico("blocoVermelho.png");
        bv7.setPosicao(7, 1);
        this.add(bv7);

        BlocoEstatico bv8 = new BlocoEstatico("blocoVermelho.png");
        bv8.setPosicao(7, 2);
        this.add(bv8);

        BlocoEstatico bv9 = new BlocoEstatico("blocoVermelho.png");
        bv9.setPosicao(8, 1);
        this.add(bv9);

        BlocoEstatico bv10 = new BlocoEstatico("blocoVermelho.png");
        bv10.setPosicao(8, 4);
        this.add(bv10);

        BlocoEstatico bv11 = new BlocoEstatico("blocoVermelho.png");
        bv11.setPosicao(8, 5);
        this.add(bv11);

        BlocoMovivel bv12 = new BlocoMovivel("blocoVerde.png");
        bv12.setPosicao(8, 7);
        this.add(bv12);

        BlocoEstatico bv13 = new BlocoEstatico("blocoVermelho.png");
        bv13.setPosicao(8, 9);
        this.add(bv13);

        BlocoEstatico bv14 = new BlocoEstatico("blocoVermelho.png");
        bv14.setPosicao(8, 10);
        this.add(bv14);

        BlocoMovivel bv15 = new BlocoMovivel("blocoVerde.png");
        bv15.setPosicao(9, 3);
        this.add(bv15);

        BlocoEstatico bv16 = new BlocoEstatico("blocoVermelho.png");
        bv16.setPosicao(9, 6);
        this.add(bv16);

        BlocoMovivel bv17 = new BlocoMovivel("blocoVerde.png");
        bv17.setPosicao(9, 7);
        this.add(bv17);

        BlocoEstatico bv18 = new BlocoEstatico("blocoVermelho.png");
        bv18.setPosicao(10, 4);
        this.add(bv18);

        BlocoMovivel bv19 = new BlocoMovivel("blocoVerde.png");
        bv19.setPosicao(10, 8);
        this.add(bv19);

        BlocoEstatico bv20 = new BlocoEstatico("blocoVermelho.png");
        bv20.setPosicao(6, 8);
        this.add(bv20);

        //Personagens

        ZigueZague zz1 = new ZigueZague("roboAmarelo.png");
        zz1.setPosicao(3, 3);
        this.add(zz1);

        ZigueZague zz2 = new ZigueZague("roboRosa.png");
        zz2.setPosicao(4, 3);
        this.add(zz2);

        ZigueZague zz3 = new ZigueZague("roboAzul.png");
        zz3.setPosicao(3, 4);
        this.add(zz3);

        ZigueZague zz4 = new ZigueZague("roboVerde.png");
        zz4.setPosicao(4, 4);
        this.add(zz4);

        //Frutas
        Fruta cereja = new Fruta("cereja.png");
        cereja.setPosicao(7, 10);
        this.add(cereja);

        Fruta maca = new Fruta("maca.png");
        maca.setPosicao(10, 3);
        this.add(maca);

        Fruta uva = new Fruta("uva.png");
        uva.setPosicao(10, 7);
        this.add(uva);

        Fruta limao = new Fruta("limao.png");
        limao.setPosicao(10, 10);
        this.add(limao);
    }

    int nivel = 0;
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}
