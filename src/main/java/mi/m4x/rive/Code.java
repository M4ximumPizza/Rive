package mi.m4x.rive;

import mi.m4x.carbide.interfaces.Beta;

/**
 * This class contains constants representing various assembly instructions and directives.
 *
 * @since 1.0.0a
 * @author M4ximumpizza
 */

@Beta()
public class Code {

    private Code() {
        // Prevent instantiation
    }

    /**
     * Invalid instruction via unknown instruction, garbage, or there is not enough bytes to decode.
     */
    public static final int INVALID;

    /**
     * Represents the assembly drective {@code db} or {@code .byte}, which declares a sequence of
     * 1 to 16 bytes of data.
     */
    public static final int DECLAREBYTE;

    /**
     * Represents the assembly directive {@code dw} or {@code .word}, which declares a sequence of
     * 1 to 8 words (typically 2 bytes each) of data.
     */
    public static final int DECLAREWORD;

    /**
     * Represents the assembly directive {@code dd} or {@code .dword}, which declares a sequence of
     * 1 to 4 double words (typically 4 bytes each) of data.
     */
    public static final int DECLAREDWORD;

    /**
     * Represents the assembly directive {@code dq} or {@code .qword}, which declares a sequence of
     * 1 to 2 quad words (typically 8 bytes each) of data.
     */
    public static final int DECLAREQWORD;

    /**
     * Represents the {@code ADD r/m8, r8} instruction. <br>
     * Opcode: {@code 00 /r} <br>
     * Available from Intel8086 and later processors. <br>
     * Operates on 8 bit operands (byte-sized). <br>
     * Supports 16-, 32-, and 64-bit modes with appropriate operand-size prefixes. <br>
     */
    public static final int ADD_RM8_R8;

    static {
        int i = 0;
        INVALID = i++;
        DECLAREBYTE = i++;
        DECLAREWORD = i++;
        DECLAREDWORD = i++;
        DECLAREQWORD = i++;
        ADD_RM8_R8 = i++;
    }

}
