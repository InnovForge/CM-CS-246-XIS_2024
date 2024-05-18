
import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.junit.Before;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harvous
 */
public class MainFormTest {

    private FrameFixture window;

    @BeforeClass
    public static void setUpOnce() {
        FailOnThreadViolationRepaintManager.install();
    }

    @Before
    public void setUp() {
        MainForm frame = GuiActionRunner.execute(() -> new MainForm());
        window = new FrameFixture(frame);
        window.show(); // shows the frame to test
    }

    @Test
    public void fieldTest() {
        window.textBox("search").click();
    }

    @After
    public void tearDown() {
        window.cleanUp();
    }

}
