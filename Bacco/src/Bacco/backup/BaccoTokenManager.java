/* Generated By:JavaCC: Do not edit this line. BaccoTokenManager.java */
package Bacco;
import java.io.*;
import java.util.*;

/** Token Manager. */
public class BaccoTokenManager implements BaccoConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 2;
         return jjMoveNfa_0(6, 0);
      case 10:
         jjmatchedKind = 4;
         return jjMoveNfa_0(6, 0);
      case 13:
         jjmatchedKind = 3;
         return jjMoveNfa_0(6, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(6, 0);
      case 33:
         jjmatchedKind = 44;
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 35:
         jjmatchedKind = 45;
         return jjMoveNfa_0(6, 0);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 40:
         jjmatchedKind = 22;
         return jjMoveNfa_0(6, 0);
      case 41:
         jjmatchedKind = 23;
         return jjMoveNfa_0(6, 0);
      case 42:
         jjmatchedKind = 29;
         return jjMoveNfa_0(6, 0);
      case 43:
         jjmatchedKind = 26;
         return jjMoveNfa_0(6, 0);
      case 44:
         jjmatchedKind = 46;
         return jjMoveNfa_0(6, 0);
      case 45:
         jjmatchedKind = 27;
         return jjMoveNfa_0(6, 0);
      case 47:
         jjmatchedKind = 28;
         return jjMoveNfa_0(6, 0);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 59:
         jjmatchedKind = 47;
         return jjMoveNfa_0(6, 0);
      case 60:
         jjmatchedKind = 37;
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 61:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 62:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 64:
         jjmatchedKind = 5;
         return jjMoveNfa_0(6, 0);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x140000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x180000000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x14000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 94:
         jjmatchedKind = 30;
         return jjMoveNfa_0(6, 0);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x14000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 123:
         jjmatchedKind = 24;
         return jjMoveNfa_0(6, 0);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 125:
         jjmatchedKind = 25;
         return jjMoveNfa_0(6, 0);
      default :
         return jjMoveNfa_0(6, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(6, 0);
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x40000000000L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 1;
         }
         break;
      case 45:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 61:
         if ((active0 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 39;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x20000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
         }
         break;
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x14000L);
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x200014000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x140000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x180000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 124:
         if ((active0 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 1;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(6, 1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(6, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(6, 1);
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 6;
            jjmatchedPos = 2;
         }
         break;
      case 65:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 80:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 84:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x24000L);
      case 100:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 114:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 2;
         }
         break;
      case 120:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      default :
         break;
   }
   return jjMoveNfa_0(6, 2);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(6, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(6, 2);
   }
   switch(curChar)
   {
      case 68:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 3;
         }
         break;
      case 69:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 78:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 86:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000L);
      case 100:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 3;
         }
         break;
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x80020000L);
      case 116:
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 3;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(6, 3);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(6, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(6, 3);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 84:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 4;
         }
         break;
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x110000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
      case 116:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 4;
         }
         break;
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000L);
      default :
         break;
   }
   return jjMoveNfa_0(6, 4);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(6, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(6, 4);
   }
   switch(curChar)
   {
      case 84:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 5;
         }
         break;
      case 101:
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 5;
         }
         break;
      case 114:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 5;
         }
         else if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 5;
         }
         break;
      case 116:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(6, 5);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 11;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 12)
                        kind = 12;
                     jjCheckNAddStates(0, 3);
                  }
                  else if (curChar == 46)
                     jjCheckNAdd(5);
                  else if (curChar == 34)
                     jjCheckNAddStates(4, 6);
                  break;
               case 0:
                  if (curChar == 34)
                     jjCheckNAddStates(4, 6);
                  break;
               case 1:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(4, 6);
                  break;
               case 3:
                  if (curChar == 34 && kind > 11)
                     kind = 11;
                  break;
               case 4:
                  if (curChar == 46)
                     jjCheckNAdd(5);
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(5);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAddStates(0, 3);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(9);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAddStates(7, 9);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
               case 7:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAdd(7);
                  break;
               case 1:
                  jjAddStates(4, 6);
                  break;
               case 2:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(4, 6);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 11 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa1_2(0x200L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_2(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa2_2(active0, 0x200L);
      default :
         return 2;
   }
}
static private int jjMoveStringLiteralDfa2_2(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 58:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(2, 9);
         break;
      default :
         return 3;
   }
   return 3;
}
static private int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
static private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 1;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x2400L & l) != 0L)
                     kind = 7;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   9, 4, 5, 10, 1, 2, 3, 4, 5, 10, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, "\123\164\141\162\164", "\105\156\144", "\126\141\162", 
"\105\156\144\126\141\162", "\75", "\50", "\51", "\173", "\175", "\53", "\55", "\57", "\52", "\136", 
"\111\163\124\162\165\145", "\111\163\116\157\164", "\164\145\170\164", "\156\165\155\142\145\162", null, 
"\76", "\74", "\76\75", "\74\75", "\41\75", "\75\75", "\46\46", "\174\174", "\41", 
"\43", "\54", "\73", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "comentario_linha",
   "comentario",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, 1, 2, 0, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfffffffff801L, 
};
static final long[] jjtoSkip = {
   0x7feL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[11];
static private final int[] jjstateSet = new int[22];
static protected char curChar;
/** Constructor. */
public BaccoTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public BaccoTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 11; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 3 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 8)
       {
          jjmatchedKind = 8;
       }
       break;
     case 2:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_2();
       if (jjmatchedPos == 0 && jjmatchedKind > 10)
       {
          jjmatchedKind = 10;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}