public class Main {
    public static void main(String[] args) {
        Bank bankSejahtera = new Bank();
        bankSejahtera.addCustomer("Elsa", "Ayu");
        
        Customer pelanggan1 = bankSejahtera.getCustomer(0);
        pelanggan1.setAccount(new Account(1000000));

        System.out.println("**************************************");
        System.out.println("   Sistem Informasi Bank Sejahtera  ");
        System.out.println("   Nama Klien : " + pelanggan1.getFirstName() + " " + pelanggan1.getLastName());
        System.out.println("**************************************");

        System.out.printf("[Info] Saldo Pertama : Rp %.0f\n\n", pelanggan1.getAccount().getBalance());

        // 4. Simulasi Transaksi Setor
        double jumlahDeposit = 350000;
        pelanggan1.getAccount().deposit(jumlahDeposit);
        System.out.printf("[Sukses] Anda menyetor uang tunai sebesar : Rp %.0f\n", jumlahDeposit);
        System.out.printf("[Info] Update Saldo Sementara : Rp %.0f\n\n", pelanggan1.getAccount().getBalance());

        // 5. Simulasi Transaksi Tarik
        double jumlahPenarikan = 150000;
        pelanggan1.getAccount().withdraw(jumlahPenarikan);
        System.out.printf("[Sukses] Anda melakukan penarikan sebesar : Rp %.0f\n", jumlahPenarikan);

        // 6. Tampilan Akhir
        System.out.println("--------------------------------------");
        System.out.printf("[Total] Saldo Terakhir Klien : Rp %.0f\n", pelanggan1.getAccount().getBalance());
    }
}