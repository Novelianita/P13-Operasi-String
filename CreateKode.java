public class CreateKode{

    static String tahun_ajaran = "2017-2018";
    static String semester = "Gasal";
    static String kd_prodi = "153";
    static String kode = "";

    public static void set_kode(){
        //statements
        //output kode = "1718115301"
        String ta1 = tahun_ajaran.substring(2, 4);
        String ta2 = tahun_ajaran.substring(7, 9);
        String no_urut = "01";
        if(semester.equals("Gasal")){
            semester = "1";
        }else{
            semester = "2";
        }

        kode = ta1+ta2+semester+kd_prodi+no_urut;
        System.out.println("Kode = "+kode);
    }

    public static void main(String[] args){
        set_kode();
    }
}