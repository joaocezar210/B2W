
import javax.swing.*;
public class Helltriangle {
 
    public static void main(String args [ ])
    {
        int[][] n = new int [10][10];
        int tt;
        n[0][0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao 1:")); 
        n[1][1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao 2:")); 
        n[2][2] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao 3:")); 
        n[3][3] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao 4:")); 
        n[4][4] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao 5:")); 
        n[5][5] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao 6:")); 
        n[6][6] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao 7:")); 
        n[7][7] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao 8:")); 
        n[8][8] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao 9:")); 
        n[9][9] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao 10:")); 

         tt =  n[0][0];
        
        if (n[1][1] >= n[2][2] )
            {
             tt=(tt+n[1][1]);
             if (n[3][3]>=n[4][4])
                {
                tt=(tt+n[3][3]);
                if (n[6][6]>=n[7][7])
                   {
                    tt=(tt+n[6][6]);
                    }
                else
                    {
                    tt=(tt+n[7][7]);
                    }
                }
             else
                {
                 tt=(tt+n[4][4]);
                 if(n[7][7]>=n[8][8])
                   {
                    tt=(tt+n[7][7]);
                    }  
                 else
                    {
                    tt=(tt+n[8][8]); 
                    }
                }
  
            }
        else
            {
             tt=(tt+n[2][2]);
             if (n[4][4]>=n[5][5])
                {
                 tt=(tt+n[4][4]);
                 if(n[7][7]>=n[8][8])
                  {
                   tt=(tt+n[7][7]);
                  }  
                 else
                  {
                   tt=(tt+n[8][8]); 
                  }
                }
            else
                {
                 tt=(tt+n[5][5]);
                 if(n[8][8]>=n[9][9])
                   {
                    tt=(tt+n[8][8]);
                   }  
                 else
                    {
                    tt=(tt+n[9][9]); 
                    }
                 }
                    
            }
        
       JOptionPane.showMessageDialog(null,"O total é de:"+tt);
      System.exit(0);
    } 
}     
        
        
        

