public class ASCIIArt
{
    public static void drawCat(int width, int height)
    {
        if(width < 1 || height < 1)
        {
            System.out.println("Required parameters: width >= 1 and height >= 1");
            return;
        }

        // Top of the cat
        StringBuilder s = new StringBuilder("|\\");
        for(int i = 0; i < width + 2; i++)
            s.append("-");
        s.append("/|\n");

        // Body
        int middle = height / 2;
        for(int i = 0; i < height; i++)
        {
            s.append("| ");
            if(i == middle)
            {
                s.append("O");
                for(int j = 0; j < width; j++)
                    s.append("_");
                s.append("O");
            }
            else
            {
                for(int j = 0; j < width + 2; j++)
                    s.append(" ");
            }
            s.append(" |\n");
        }

        // Bottom of the cat
        s.append(" \\_");
        for(int j = 0; j < width; j++)
            s.append("^");
        s.append("_/ \n");

        System.out.println(s.toString());
    }
}
