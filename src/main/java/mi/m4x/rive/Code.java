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
     * Represents the {@code ADD r/m8, r8} instruction.<br>
     * Opcode: {@code 00 /r}.<br>
     * Available from Intel 8086 and later processors.<br>
     * Operates on 8-bit operands (byte-sized) in 16-, 32-, and 64-bit modes.<br>
     * Adds the 8-bit value in the source register to the 8-bit value in the destination register or memory,
     * storing the result in the destination.<br>
     * Updates the following flags: Overflow (O), Sign (S), Zero (Z), Auxiliary Carry (A), Carry (C), and Parity (P).<br>
     * Supports {@code LOCK}, {@code XACQUIRE}, and {@code XRELEASE} prefixes for atomic memory operations.<br>
     */
    public static final int ADD_RM8_R8;

    /**
     * Represents the {@code ADD r/m16, r16} instruction. <br>
     * Opcode: {@code o16 01 /r} {operand-size over prefix for 16-bit operands}. <br>
     * Available since Intel 8086 processors. <br>
     * Operates on 16-bit operands in 16-, 32- and 64-bit modes. <br>
     * Updates the following flags: Overflow, Sign, Zero, Auxiliary Carry, Carry, and parity. <br>
     * Supports {@code LOCK}, {@code XACQUIRE}, and {@code XRELEASE} prefixes for atomic operations.
     */
    public static final int ADD_RM16_R16;

    /**
     * Represents the {@code ADD r/m32, r32} instruction.<br>
     * Opcode: {@code o32 01 /r} (operand-size prefix for 32-bit operands).<br>
     * Available from Intel 386 and later processors.<br>
     * Operates on 32-bit operands in 16-, 32-, and 64-bit modes (requires operand-size prefix in some modes).<br>
     * Adds the 32-bit value in the source register to the 32-bit value in the destination register or memory,
     * storing the result in the destination.<br>
     * Updates the following flags: Overflow (O), Sign (S), Zero (Z), Auxiliary Carry (A), Carry (C), and Parity (P).<br>
     * Supports {@code LOCK}, {@code XACQUIRE}, and {@code XRELEASE} prefixes for atomic memory operations.<br>
     */
    public static final int ADD_RM32_R32;

    /**
     * Represents the {@code ADD r/m64, r64} instruction.<br>
     * Opcode: {@code o64 01 /r} (operand-size prefix for 64-bit operands).<br>
     * Available on x86-64 (64-bit mode) processors.<br>
     * Operates on 64-bit operands.<br>
     * Adds the 64-bit value in the source register to the 64-bit value in the destination register or memory,
     * storing the result in the destination.<br>
     * Updates the following flags: Overflow (O), Sign (S), Zero (Z), Auxiliary Carry (A), Carry (C), and Parity (P).<br>
     * Supports {@code LOCK}, {@code XACQUIRE}, and {@code XRELEASE} prefixes for atomic memory operations.<br>
     */
    public static final int ADD_RM64_R64;

    /**
     * Represents the {@code ADD r8, r/m8} instruction.<br>
     * Opcode: {@code 02 /r}.<br>
     * Available from Intel 8086 and later processors.<br>
     * Operates on 8-bit operands (byte-sized) in 16-, 32-, and 64-bit modes.<br>
     * Adds the 8-bit value in the source register/memory to the 8-bit destination register, storing the result in the register.<br>
     * Updates Overflow (O), Sign (S), Zero (Z), Auxiliary Carry (A), Carry (C), and Parity (P) flags.
     */
    public static final int ADD_R8_RM8;

    /**
     * Represents the {@code ADD r16, r/m16} instruction.<br>
     * Opcode: {@code o16 03 /r} (operand-size prefix for 16-bit operands).<br>
     * Available from Intel 8086 and later processors.<br>
     * Operates on 16-bit operands in 16-, 32-, and 64-bit modes.<br>
     * Adds the 16-bit value in the source register/memory to the 16-bit destination register, storing the result in the register.<br>
     * Updates Overflow (O), Sign (S), Zero (Z), Auxiliary Carry (A), Carry (C), and Parity (P) flags.
     */
    public static final int ADD_R16_RM16;

    /**
     * Represents the {@code ADD r32, r/m32} instruction.<br>
     * Opcode: {@code o32 03 /r} (operand-size prefix for 32-bit operands).<br>
     * Available from Intel 386 and later processors.<br>
     * Operates on 32-bit operands in 16-, 32-, and 64-bit modes.<br>
     * Adds the 32-bit value in the source register/memory to the 32-bit destination register, storing the result in the register.<br>
     * Updates Overflow (O), Sign (S), Zero (Z), Auxiliary Carry (A), Carry (C), and Parity (P) flags.
     */
    public static final int ADD_R32_RM32;

    /**
     * Represents the {@code ADD r64, r/m64} instruction.<br>
     * Opcode: {@code o64 03 /r} (operand-size prefix for 64-bit operands).<br>
     * Available on x86-64 (64-bit mode) processors.<br>
     * Operates on 64-bit operands.<br>
     * Adds the 64-bit value in the source register/memory to the 64-bit destination register, storing the result in the register.<br>
     * Updates Overflow (O), Sign (S), Zero (Z), Auxiliary Carry (A), Carry (C), and Parity (P) flags.
     */
    public static final int ADD_R64_RM64;

    static {
        int i = 0;
        INVALID = i++;
        DECLAREBYTE = i++;
        DECLAREWORD = i++;
        DECLAREDWORD = i++;
        DECLAREQWORD = i++;
        ADD_RM8_R8 = i++;
        ADD_RM16_R16 = i++;
        ADD_RM32_R32 = i++;
        ADD_RM64_R64 = i++;
        ADD_R8_RM8 = i++;
        ADD_R16_RM16 = i++;
        ADD_R32_RM32 = i++;
        ADD_R64_RM64 = i++;
    }
}
