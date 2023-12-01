public class DNALib
{
    // Static methods
    public static boolean validator(String dna)
    {
        if(dna.isEmpty() || dna.length() % 3 != 0)
        {
            return(false);
        }

        for(int i = 0; i <= 2; i++)
        {
            if( !(dna.charAt(i) == 'A' || dna.charAt(i) == 'C' || dna.charAt(i) == 'G' || dna.charAt(i) == 'T') )
            {
                    return(false);
            }
        }
        if(dna.length() == 3)
        {
            return(true);
        }
        return( validator( dna.substring(3) ) );

    }

    public static String reverser(String dna)
    {
        if(dna.isEmpty() || dna.length() == 1)
        {
            return(dna);
        }
        else
        {
            return(dna.substring( dna.length() - 1) + reverser(dna.substring(0, dna.length() - 1)));
        }
    }

    public static String inverser(String dna)
    {
        if(dna.length() == 0)
        {
            return("");
        }
        char firstIndex = dna.charAt(0);
        String translated = "";
        if(firstIndex == 'A')
        {
            translated = "T";
        }
        else if(firstIndex == 'C')
        {
            translated = "G";
        }
        else if(firstIndex == 'G')
        {
            translated = "C";
        }
        else if(firstIndex == 'T')
        {
            translated = "A";
        }
        return(translated + inverser(dna.substring(1)));
    }

    public static String translator(String dna)
    {
        if(dna.isEmpty())
        {
            return("");
        }
        String sequence = dna.substring(0, 3);
        String aminoacid = "";
        switch(sequence){
            case "GCA":
            case "GCC":
            case "GCG":
            case "GCT":
                aminoacid = "A";
                break;
            case "TGC":
            case "TGT":
                aminoacid = "C";
                break;
            case "GAC":
            case "GAT":
                aminoacid = "D";
                break;
            case "GAA":
            case "GAG":
                aminoacid = "E";
                break;
            case "TTC":
            case "TTT":
                aminoacid = "F";
                break;
            case "GGA":
            case "GGC":
            case "GGG":
            case "GGT":
                aminoacid = "G";
                break;
            case "CAC":
            case "CAT":
                aminoacid = "H";
                break;
            case "ATA":
            case "ATC":
            case "ATT":
                aminoacid = "I";
                break;
            case "AAA":
            case "AAG":
                aminoacid = "K";
                break;
            case "CTA":
            case "CTC":
            case "CTG":
            case "CTT":
            case "TTA":
            case "TTG":
                aminoacid = "L";
                break;
            case "ATG":
                aminoacid = "M";
                break;
            case "AAT":
            case "AAC":
                aminoacid = "N";
                break;
            case "CCA":
            case "CCC":
            case "CCG":
            case "CCT":
                aminoacid = "P";
                break;
            case "CAA":
            case "CAG":
                aminoacid = "Q";
                break;
            case "AGA":
            case "AGG":
            case "CGA":
            case "CGC":
            case "CGG":
            case "CGT":
                aminoacid = "R";
                break;
            case "AGC":
            case "AGT":
            case "TCA":
            case "TCC":
            case "TCG":
            case "TCT":
                aminoacid = "S";
                break;
            case "ACA":
            case "ACC":
            case "ACG":
            case "ACT":
                aminoacid = "T";
                break;
            case "GTA":
            case "GTC":
            case "GTG":
            case "GTT":
                aminoacid = "V";
                break;
            case "TGG":
                aminoacid = "W";
                break;
            case "TAC":
            case "TAT":
                aminoacid = "Y";
                break;
            case "TAA":
            case "TAG":
            case "TGA":
                aminoacid = "-";
                break;
        }

        return(aminoacid + translator(dna.substring(3)));
    }

}
