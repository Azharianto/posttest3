import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import main.*;
public class App{
    static ArrayList<pc> pcList = new ArrayList<>();
    static ArrayList<Mobile> mobileList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    public static void main(String[] args) throws IOException{
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n=======================");
            System.out.println("==== Diamond Store ====");
            System.out.println("=======================");
            System.out.println("1. Tambahkan item diamond");
            System.out.println("2. Tampilkan semua item diamond Store");
            System.out.println("3. Ubah Item diamond");
            System.out.println("4. Hapus Item diamond");
            System.out.println("5. Keluar Store");

            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    addItem();
                    break;
                case 2:
                    showAllItems();
                    break;
                case 3:
                    editItem();
                    break;
                case 4:
                    deleteItem();
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Terima kasih telah berkunjung di store kami");
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
                    break;
            }
        }
    }

    public static void addItem()throws IOException {
        System.out.println("Pilih Tipe game : ");
        System.out.println("1. PC ");
        System.out.println("1. Mobile");
        System.out.println("Pilih : ");
        int menu = Integer.parseInt(br.readLine());
        if(menu == 1 ){
            int idpc = pcList.size() + 1;
            System.out.print("\nMasukkan Nama Game: ");
            String name = br.readLine();
            System.out.print("Masukkan Harga Item: ");
            int price = scanner.nextInt();
            String status = "";
            pc pclist = new pc(name,price,idpc,status);
            pcList.add(pclist);
        }else{
            int idmobile = mobileList.size() + 1;
            System.out.print("\nMasukkan Nama Game: ");
            String name = br.readLine();
            System.out.print("Masukkan Harga Item: ");
            int price = scanner.nextInt();
            String status = "";
            Mobile mobilelist = new Mobile(name,price,idmobile,status);
            mobileList.add(mobilelist);
        }
        System.out.println("Item berhasil ditambahkan!");
    }

    public static void showAllItems() throws IOException{
        System.out.println("Pilih Tipe game : ");
        System.out.println("1. PC ");
        System.out.println("1. Mobile");
        System.out.println("Pilih : ");
        int menu = Integer.parseInt(br.readLine());
        if(menu == 1 ){
            for (int i = 0; i < pcList.size(); i++) {
                System.out.println((i+1) + ". " + pcList.get(i).toString());
            }
        }else{
            for (int i = 0; i < mobileList.size(); i++) {
                System.out.println((i+1) + ". " + mobileList.get(i).toString());
            }
        }
    }

    public static void editItem() throws IOException{
        System.out.println("Pilih Tipe game : ");
        System.out.println("1. PC ");
        System.out.println("1. Mobile");
        System.out.println("Pilih : ");
        int menu = Integer.parseInt(br.readLine());
        if(menu == 1 ){
            System.out.print("Pilih nomor item yang ingin diubah: ");
            int pcIndex = scanner.nextInt() - 1;
            if (pcIndex >= 0 && pcIndex < pcList.size()) {
                System.out.print("Masukkan Nama Item Baru: ");
                String newName = scanner.next();
                System.out.print("Masukkan Harga Item Baru: ");
                int newPrice = scanner.nextInt();
                String Status ="";
                pc pcud = new pc(newName,newPrice,pcIndex,Status);
                pcList.set(pcIndex,pcud);
                System.out.println("Item berhasil diubah!");
            } else {
                System.out.println("Nomor item tidak tersedia!");
            }
        }else{
            System.out.print("Pilih nomor item yang ingin diubah: ");
            int mIndex = scanner.nextInt() - 1;
            if (mIndex >= 0 && mIndex < mobileList.size()) {
                System.out.print("Masukkan Nama Item Baru: ");
                String newName = scanner.next();
                System.out.print("Masukkan Harga Item Baru: ");
                int newPrice = scanner.nextInt();

                String Status = "";
                Mobile mobilecud = new Mobile(newName,newPrice,mIndex,Status);
            mobileList.set(mIndex,mobilecud);

                System.out.println("Item berhasil diubah!");
            } else {
                System.out.println("Nomor item tidak tersedia!");
            }
        }
    }

    public static void deleteItem() throws IOException{
        System.out.println("Pilih Tipe game : ");
        System.out.println("1. PC ");
        System.out.println("1. Mobile");
        int menu = Integer.parseInt(br.readLine());
        if(menu == 1 ){
            System.out.print("Pilih nomor item yang ingin dihapus: ");
        int pcIndex = scanner.nextInt() - 1;

        if (pcIndex >= 0 && pcIndex < pcList.size()) {
            pcList.remove(pcIndex);
            System.out.println("Item berhasil dihapus!");
        } else {
            System.out.println("Nomor item tidak tersedia!");
        }
        }else{
            System.out.print("Pilih nomor item yang ingin dihapus: ");
        int mIndex = scanner.nextInt() - 1;

        if (mIndex >= 0 && mIndex < mobileList.size()) {
            mobileList.remove(mIndex);
            System.out.println("Item berhasil dihapus!");
        } else {
            System.out.println("Nomor item tidak tersedia!");
        }
        }
    }
}