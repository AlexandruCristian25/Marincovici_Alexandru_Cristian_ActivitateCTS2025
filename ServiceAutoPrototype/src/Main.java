public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        StickerPrototype stickerPrototype = new StickerPrototype();

        IMasina masina1 = new Masina("Audi", 2010, true);
        IMasina masina2 = new Masina("Chevrolet", 2019, false);
        IMasina masina3 = new Masina("Mercedes", 2015, true);
        IMasina masina4 = new Masina("Ford", 2016, false);
        IMasina masina5 = new Masina("Audi", 2012, true);
        IMasina masina6 = new Masina("Chevrolet", 2017, false);

        Sticker sticker1 = stickerPrototype.getSticker(masina1);
        System.out.println(sticker1);
        Sticker sticker2 = stickerPrototype.getSticker(masina2);
        System.out.println(sticker2);
        Sticker sticker3 = stickerPrototype.getSticker(masina3);
        System.out.println(sticker3);
        Sticker sticker4 = stickerPrototype.getSticker(masina4);
        System.out.println(sticker4);
        Sticker sticker5 = stickerPrototype.getSticker(masina5);
        System.out.println(sticker5);
        Sticker sticker6 = stickerPrototype.getSticker(masina6);
        System.out.println(sticker6);


    }
}