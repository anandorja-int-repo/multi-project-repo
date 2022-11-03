package PatternProgram;

import PatternProgram.PatternBasicProgram;
import junit.framework.TestCase;

public class PatternBasicProgramTest extends TestCase {

    PatternBasicProgram obj = new PatternBasicProgram();
    StringBuilder bul = new StringBuilder();

    public void teststarRightTriangle() {

        bul.append("*\n");
        bul.append("* *\n");
        bul.append("* * *\n");
        bul.append("* * * *\n");
        bul.append("* * * * *\n");
        String response = obj.starRightTriangle(5);
        String starRinghtTriangle = bul.toString();
        assertEquals(starRinghtTriangle, response);
    }

    public void testleftTrianglePattern() {
//        bul.append("           * \n");
//        bul.append("         * * \n");
//        bul.append("       * * * \n");
//        bul.append("     * * * * \n");
//        bul.append("   * * * * * \n");
        bul.append("        *\n");
        bul.append("      * *\n");
        bul.append("    * * *\n");
        bul.append("  * * * *\n");
        bul.append("* * * * *\n");
        String lefttrianglrPattern = bul.toString();
        String response = obj.leftTrianglePattern(5);
        assertEquals(lefttrianglrPattern, response);

    }

    public void testnumberPramid() {
        bul.append("     1 \n");
        bul.append("    1 2 \n");
        bul.append("   1 2 3 \n");
        bul.append("  1 2 3 4 \n");
        bul.append(" 1 2 3 4 5 \n");
        String testnumberPramid = bul.toString();
        String val = obj.numberPramid(5);
        assertEquals(testnumberPramid,val);
    }

    public void testreversepramid() {
        bul.append("*********\n");
        bul.append(" *******\n");
        bul.append("  *****\n");
        bul.append("   ***\n");
        bul.append("    *\n");
        String testreversepramid = bul.toString();
        String val = obj.reversepramid(5);
        assertEquals(testreversepramid, val);
    }

    public void testupperStarTriangle() {
        bul.append("      *\n");
        bul.append("     **\n");
        bul.append("    ***\n");
        bul.append("   ****\n");
        bul.append("  *****\n");
        String testupperStarTriangle = bul.toString();
        String response = obj.upperStarTriangle(5);
        assertEquals(testupperStarTriangle,response);
    }

    public void testmirrorTriangle(){
        bul.append("    * \n");
        bul.append("   * * \n");
        bul.append("  * * * \n");
        bul.append(" * * * * \n");
        bul.append("* * * * * \n");
        bul.append("* * * * * \n");
        bul.append(" * * * * \n");
        bul.append("  * * * \n");
        bul.append("   * * \n");
        bul.append("    * \n");
        String testmirrorTriangle = bul.toString();
        String response = obj.mirrorTriangle(5);
        assertEquals(testmirrorTriangle,response);
    }

    public void testdownwardStarpattern(){
        bul.append("* * * * * * \n");
        bul.append("* * * * * \n");
        bul.append("* * * * \n");
        bul.append("* * * \n");
        bul.append("* * \n");
        bul.append("* \n");
        String testdownwardStarpattern = bul.toString();
        String reponse = obj.downwardStarpattern(5);
        assertEquals(testdownwardStarpattern,reponse);
    }

    public void testMirrorLowerStarPattern(){
        bul.append("* * * * * \n");
        bul.append(" * * * * \n");
        bul.append("  * * * \n");
        bul.append("   * * \n");
        bul.append("    * \n");
        bul.append("    * \n");
        bul.append("   * * \n");
        bul.append("  * * * \n");
        bul.append(" * * * * \n");
        bul.append("* * * * * \n");
        String response = obj.MirrorLowerStarPattern(5);
        String testMirrorLowerStarPattern = bul.toString();
        assertEquals(testMirrorLowerStarPattern,response);
    }

    public void testprintDiamondShape(){
        bul.append("    *\n");
        bul.append("   ***\n");
        bul.append("  *****\n");
        bul.append(" *******\n");
        bul.append("*********\n");
        bul.append(" *******\n");
        bul.append("  *****\n");
        bul.append("   ***\n");
        bul.append("    *\n");
        String testprintDiamondShape = bul.toString();
        String response = obj.printDiamondShape(5);
        assertEquals(testprintDiamondShape,response);
    }

    public void testPrintSquareStarPattern(){
        bul.append("*****\n");
        bul.append("*   *\n");
        bul.append("*   *\n");
        bul.append("*   *\n");
        bul.append("*****\n");
        String testPrintSquareStarPattern = bul.toString();
        String respone = obj.PrintSquareStarPattern(5);
        assertEquals(testPrintSquareStarPattern,respone);
    }

}