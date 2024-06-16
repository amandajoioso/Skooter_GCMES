package Controler;

import Modelo.BlocoSeta;
import Modelo.Personagem;
import Modelo.Skoot;
import Auxiliar.Consts;
import Auxiliar.Desenho;
import Auxiliar.Posicao;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Tela extends javax.swing.JFrame implements MouseListener, KeyListener {

    private Skoot skoot;
    private Fases fase;
    private ArrayList<Personagem> faseAtual;
    private final ControleDeJogo cj = new ControleDeJogo();
    private Graphics g2;
    private int nivel = 0;

    public Tela() {
        Desenho.setCenario(this);
        initComponents();
        this.addMouseListener(this); /*mouse*/

        this.addKeyListener(this);   /*teclado*/
        /*Cria a janela do tamanho do tabuleiro + insets (bordas) da janela*/
        this.setSize(Consts.RES * Consts.CELL_SIDE + getInsets().left + getInsets().right,
                Consts.RES * Consts.CELL_SIDE + getInsets().top + getInsets().bottom);


        faseAtual = new ArrayList<Personagem>();


    }


    public void addPersonagem(Personagem umPersonagem) {
        faseAtual.add(umPersonagem);
    }

    public void removePersonagem(Personagem umPersonagem) {
        faseAtual.remove(umPersonagem);
    }

    public Graphics getGraphicsBuffer(){
        return g2;
    }
    public void paint(Graphics gOld) {
        Graphics g = this.getBufferStrategy().getDrawGraphics();
        /*Criamos um contexto gráfico*/
        g2 = g.create(getInsets().left, getInsets().top, getWidth() - getInsets().right, getHeight() - getInsets().top);
        /*************Desenha cenário de fundo**************/
        for (int i = 0; i < Consts.RES; i++) {
            for (int j = 0; j < Consts.RES; j++) {
                // Desenha o cenário de fundo com base no nível atual
                try {
                    if(nivel == 0){
                        Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "MenuPrincipal.png");
                        g2.drawImage(newImage, 0 , 0 , Consts.CELL_SIDE * Consts.RES, Consts.CELL_SIDE * Consts.RES, null);
                    }
                    else if(nivel == 1){
                        Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "fundo_fase1.png");
                        g2.drawImage(newImage,
                                j * Consts.CELL_SIDE, i * Consts.CELL_SIDE, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
                    }
                    else if(nivel == 2){
                        Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "fundo_fase2.png");
                        g2.drawImage(newImage,
                                j * Consts.CELL_SIDE, i * Consts.CELL_SIDE, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
                    }
                    else if(nivel == 3){
                        Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "fundo_fase3.png");
                        g2.drawImage(newImage,
                                j * Consts.CELL_SIDE, i * Consts.CELL_SIDE, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
                    }
                    else if(nivel == 4){
                        Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "fundo_fase4.png");
                        g2.drawImage(newImage,
                                j * Consts.CELL_SIDE, i * Consts.CELL_SIDE, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
                    }
                    else if(nivel == 5){
                        Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "fundo_fase5.png");
                        g2.drawImage(newImage,
                                j * Consts.CELL_SIDE, i * Consts.CELL_SIDE, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
                    }
                    else if(nivel == 6){
                        Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "derrota.png");
                        g2.drawImage(newImage, 0 , 0 , Consts.CELL_SIDE * Consts.RES, Consts.CELL_SIDE * Consts.RES, null);
                    }
                    else if(nivel == 7){
                        Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "vitoria.png");
                        g2.drawImage(newImage, 0 , 0 , Consts.CELL_SIDE * Consts.RES, Consts.CELL_SIDE * Consts.RES, null);
                    }
                    else if(nivel == 8){
                        Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "controles1.png");
                        g2.drawImage(newImage, 0 , 0 , Consts.CELL_SIDE * Consts.RES, Consts.CELL_SIDE * Consts.RES, null);
                    }
                    else if(nivel == 9){
                        Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "controles2.png");
                        g2.drawImage(newImage, 0 , 0 , Consts.CELL_SIDE * Consts.RES, Consts.CELL_SIDE * Consts.RES, null);
                    }

                } catch (IOException ex) {
                    Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        // Verifica se a lista de fase atual não está vazia
        if (!this.faseAtual.isEmpty()) {
            // Processa e desenha todos os elementos presentes na fase atual
            this.cj.processaTudo(faseAtual);
            this.cj.desenhaTudo(faseAtual);

            // Verifica se não há mais frutas na fase atual e o nível para decidir se deve ir ao próximo nível
            if(!this.cj.temFruta(faseAtual) && nivel == 1){
                this.faseAtual.clear();
                skoot = new Skoot("skoot.png");
                skoot.setPosicao(5, 5);
                this.addPersonagem(skoot);
                fase = new Fases();
                fase.setFase2(skoot);
                faseAtual = fase;
                nivel = 2;
            }

            else if(!this.cj.temFruta(faseAtual) && nivel == 2){
                this.faseAtual.clear();
                skoot = new Skoot("skoot.png");
                skoot.setPosicao(5, 5);
                this.addPersonagem(skoot);
                fase = new Fases();
                fase.setFase3(skoot);
                faseAtual = fase;
                nivel = 3;
            }

            else if(!this.cj.temFruta(faseAtual) && nivel == 3){
                this.faseAtual.clear();
                skoot = new Skoot("skoot.png");
                skoot.setPosicao(5, 5);
                this.addPersonagem(skoot);
                fase = new Fases();
                fase.setFase4(skoot);
                faseAtual = fase;
                nivel = 4;
            }

            else if(!this.cj.temFruta(faseAtual) && nivel == 4){
                this.faseAtual.clear();
                skoot = new Skoot("skoot.png");
                skoot.setPosicao(1, 1);
                this.addPersonagem(skoot);
                fase = new Fases();
                fase.setFase5(skoot);
                faseAtual = fase;
                nivel = 5;
            }

            // Verifica se ainda existem frutas na fase atual e se o Skoot ainda tem vidas
            // Caso as vidas tenham acabado, é mostrada a tela de derrota
            else if(this.cj.temFruta(faseAtual)){
                if(skoot.getVidas() == 0){
                    this.faseAtual.clear();
                    nivel = 6;
                }
            }

            // Verifica se o jogador concluiu o jogo
            else if(!this.cj.temFruta(faseAtual) && nivel == 5){
                this.faseAtual.clear();
                nivel = 7;
            }
        }

        g.dispose();
        g2.dispose();
        if (!getBufferStrategy().contentsLost()) {
            getBufferStrategy().show();
        }
    }

    public void go() {
        TimerTask task = new TimerTask() {
            public void run() {
                repaint();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 0, Consts.PERIOD);
    }

    public void keyPressed(KeyEvent e) {
        int movimento; //indica a direcao do movimento
        if (e.getKeyCode() == KeyEvent.VK_C) {
            this.faseAtual.clear();


            //MOVIMENTOS
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            movimento = 1;
            Posicao p = new Posicao(skoot.getLinha() - 1, skoot.getColuna());

            if(p.posicaoValida()){
                if(!this.colisao(p, movimento)){
                    skoot.moveUp();
                    while(this.caiuEmSeta());
                }
            }

        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            movimento = 2;
            Posicao p = new Posicao(skoot.getLinha() + 1, skoot.getColuna());

            if(p.posicaoValida()){
                if(!this.colisao(p, movimento)){
                    skoot.moveDown();
                    while(this.caiuEmSeta());
                }
            }

        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            movimento = 3;
            Posicao p = new Posicao(skoot.getLinha(), skoot.getColuna() + 1);

            if(p.posicaoValida()){
                if(!this.colisao(p, movimento)){
                    skoot.moveRight();
                    while(this.caiuEmSeta());
                }
            }

        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            movimento = 4;
            Posicao p = new Posicao(skoot.getLinha(), skoot.getColuna() - 1);

            if(p.posicaoValida()){
                if(!this.colisao(p, movimento)){
                    skoot.moveLeft();
                    while(this.caiuEmSeta());
                }
            }

        }

        // começa o jogo
        else if (e.getKeyCode() == KeyEvent.VK_R) {
            skoot = new Skoot("skoot.png");
            skoot.setPosicao(3, 4);
            this.addPersonagem(skoot);
            fase = new Fases();
            fase.setFase1(skoot);
            faseAtual = fase;
            nivel = 1;
        }

        // vai para o Menu Principal
        else if (e.getKeyCode() == KeyEvent.VK_M) {
            nivel = 0;
        }

        // vai para as instruções de jogo
        else if (e.getKeyCode() == KeyEvent.VK_J) {
            nivel = 8;
        }

        // navegação entre as telas de instrução
        else if (e.getKeyCode() == KeyEvent.VK_P && nivel == 8) {
            nivel = 9;
        }

        // navegação entre as telas de instrução
        else if (e.getKeyCode() == KeyEvent.VK_B && nivel == 9) {
            nivel = 8;
        }

        // salva o jogo
        else if (e.getKeyCode() == KeyEvent.VK_S) {
            salvar(fase, nivel);
        }

        // recarrega o jogo
        else if (e.getKeyCode() == KeyEvent.VK_L) {
            fase = recarregar();
            this.faseAtual.clear();
            faseAtual = fase;
            this.skoot = carregaSkoot();
            this.nivel = fase.getNivel(); // Definir o valor do nível recuperado

        }

        if(nivel == 1) {
            this.setTitle("-> Cell: " + (skoot.getPosicao().getLinha()) + ", "
                    + (skoot.getPosicao().getColuna()));
        }
    }

    public void mousePressed(MouseEvent e) {
        /* Clique do mouse desligado*/
        int x = e.getX();
        int y = e.getY();

        this.setTitle("X: "+ x + ", Y: " + y +
                " -> Cell: " + (y/Consts.CELL_SIDE) + ", " + (x/Consts.CELL_SIDE));

        this.skoot.setPosicao(y/Consts.CELL_SIDE, x/Consts.CELL_SIDE);

        repaint();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POO2023-1 - Skooter");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 561, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    // Verifica se há colisão entre a posição p e os obstáculos presentes na fase atual
    public Boolean colisao(Posicao p, int movimento) {

        for (Personagem obstaculo : faseAtual) {

            Posicao posicaoObstaculo = obstaculo.getPosicao();

            if (posicaoObstaculo.getLinha() == p.getLinha() && posicaoObstaculo.getColuna() == p.getColuna()) {     //houve colisao
                if (obstaculo.isbTransponivel()) {    //Se transponivel
                    return false;

                } else if (obstaculo.isbMovivel()) {   //Se movivel -> empurrar

                    return this.empurrar(obstaculo, movimento);

                } else if (obstaculo.isbMortal()) {
                    skoot.perderVida();
                }
                return true;
            }
        }
        return false;   //nao houve colisao
    }

    // Verifica se há colisão entre a posição p e os obstáculos presentes na fase atual
    public Boolean colisao2(Posicao p){

        for (Personagem obstaculo : faseAtual) {

            Posicao posicaoObstaculo = obstaculo.getPosicao();

            if (posicaoObstaculo.getLinha() == p.getLinha() && posicaoObstaculo.getColuna() == p.getColuna()) {     //houve colisao

                return true;    //houve colisao


            }
        }
        return false;   //nao houve colisao
    }

    // Move o obstáculo na direção especificada pelo movimento
    public boolean empurrar(Personagem obstaculo, int movimento){
        Posicao p = null;

        switch (movimento) {
            case 1 -> { //Move up
                p = new Posicao(obstaculo.getLinha() - 1, obstaculo.getColuna());
                if (p.posicaoValida()) {
                    if (!this.colisao2(p)) {
                        obstaculo.setPosicao(p.getLinha(), p.getColuna());
                    } else {
                        if (obstaculo.isbRemovivel())
                            this.removePersonagem(obstaculo);
                        return true;
                    }
                } else return true;
            }
            case 2 -> { //Move down
                p = new Posicao(obstaculo.getLinha() + 1, obstaculo.getColuna());
                if (p.posicaoValida()) {
                    if (!this.colisao2(p)) {
                        obstaculo.setPosicao(p.getLinha(), p.getColuna());
                    } else {
                        if (obstaculo.isbRemovivel())
                            this.removePersonagem(obstaculo);
                        return true;
                    }
                } else return true;
            }
            case 3 -> { //Move right
                p = new Posicao(obstaculo.getLinha(), obstaculo.getColuna() + 1);
                if (p.posicaoValida()) {
                    if (!this.colisao2(p)) {
                        obstaculo.setPosicao(p.getLinha(), p.getColuna());
                    } else {
                        if (obstaculo.isbRemovivel())
                            this.removePersonagem(obstaculo);
                        return true;
                    }
                } else return true;
            }
            case 4 -> { //Move left
                p = new Posicao(obstaculo.getLinha(), obstaculo.getColuna() - 1);
                if (p.posicaoValida()) {
                    if (!this.colisao2(p)) {
                        obstaculo.setPosicao(p.getLinha(), p.getColuna());
                    } else {
                        if (obstaculo.isbRemovivel())
                            this.removePersonagem(obstaculo);
                        return true;
                    }
                } else return true;
            }
            default -> {
            }
        }

        return false;
    }

    // Verifica se o personagem principal caiu em um bloco seta
    public boolean caiuEmSeta(){

        for (Personagem seta : faseAtual) {
            Posicao posicaoSeta = seta.getPosicao();

            if (seta instanceof BlocoSeta) {
                if (posicaoSeta.getLinha() == this.skoot.getLinha() && posicaoSeta.getColuna() == this.skoot.getColuna()) {     //houve colisao

                    switch (seta.getDirecao()) {
                        case 1 -> skoot.moveUp();     // Move para cima
                        case 2 -> skoot.moveDown();   // Move para baixo
                        case 3 -> skoot.moveRight();  // Move para a direita
                        case 4 -> skoot.moveLeft();   // Move para a esquerda
                        default -> skoot.setPosicao(0, 0);  // Define a posição
                    }


                    return true;
                }
            }
        }

        return false;


    }

    public static void salvar(Fases jogo, int nivel) {
        // Salva o jogo em um arquivo

        try {
            FileOutputStream fileOut = new FileOutputStream("jogo_salvo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(jogo);  // Salva o objeto Fases no arquivo
            out.writeInt(nivel);    // Salva o valor do nível
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Fases recarregar() {
        // Recarrega o jogo a partir de um arquivo

        Fases jogo = null;
        int nivel = 0;

        try {
            FileInputStream fileIn = new FileInputStream("jogo_salvo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            jogo = (Fases) in.readObject();  // Lê o objeto Fases do arquivo
            nivel = in.readInt();            // Lê o valor do nível
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (jogo != null) {
            jogo.setNivel(nivel);  // Configura o valor do nível no objeto Fases
        }

        return jogo;
    }


    public Skoot carregaSkoot() {
        // Carrega o objeto Skoot da fase salva
        for (Personagem personagem : faseAtual) {
            if (personagem instanceof Skoot) {
                return (Skoot) personagem;
            }
        }
        return null; // Retorna null caso nenhum objeto Skoot seja encontrado
    }


}
