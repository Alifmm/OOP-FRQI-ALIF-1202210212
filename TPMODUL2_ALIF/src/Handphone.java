public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone(boolean fingerprint, String drive, int ram, float processor) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi() {
        System.out.println("Handphone ini memiliki drive tipe "  + drive  + " dengan ram sebesar " + ram
                 + " GB dan processor secepat "  + processor + " Ghz. " + "Selain itu handphone ini "
                + (fingerprint == false ? "Tidak memiliki " : "memiliki ") + "fingeprint");
    }

    public void telfon(int noPhone) {
        System.out.println("Handphone berhasil menyambungkan telfon ke No " + noPhone);
    }

    public void kirimSMS(int noPhone) {
        System.out.println("Handphone berhasil mengirim SMS ke No " + noPhone);
    }

    public void manyMessage(int noPhone, int otherPhoneNumber) {
        System.out.println("Handphone berhasil mengirim SMS ke No " + noPhone  + " dan " + otherPhoneNumber);
    }
}