public static File[] allSubdirs(String location){
    File plik = new File(location);
    File[] pliki = plik.listFiles();
    File[] wynik = pliki;
    /*for(int i = 0; i < pliki.length; i++){
        if(pliki[i].isDirectory()){
            wynik.push(pliki[i]);
        }
    }*/
    return pliki;

}
