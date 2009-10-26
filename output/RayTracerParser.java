// $ANTLR 3.1.2 D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g 2009-10-19 19:26:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RayTracerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LIGHTSOURCE", "OPEN_BRACKET", "COLOR", "CLOSE_BRACKET", "CAMERA", "LOCATION", "LOOK_AT", "SPHERE", "COMMA", "PLANE", "PIGMENT", "LESS_THAN", "GREATER_THAN", "DIGIT", "TYPE_COLOR", "GLOBAL", "AMBIENTLIGHT", "NEWLINE", "WHITESPACE", "'-'", "'.'", "'finish'", "'ambient'", "'diffuse'", "'phong'", "'phong_size'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int GREATER_THAN=16;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int PIGMENT=14;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int WHITESPACE=22;
    public static final int TYPE_COLOR=18;
    public static final int EOF=-1;
    public static final int COLOR=6;
    public static final int OPEN_BRACKET=5;
    public static final int PLANE=13;
    public static final int LOOK_AT=10;
    public static final int NEWLINE=21;
    public static final int LIGHTSOURCE=4;
    public static final int CAMERA=8;
    public static final int COMMA=12;
    public static final int AMBIENTLIGHT=20;
    public static final int LESS_THAN=15;
    public static final int LOCATION=9;
    public static final int DIGIT=17;
    public static final int GLOBAL=19;
    public static final int CLOSE_BRACKET=7;
    public static final int SPHERE=11;

    // delegates
    // delegators


        public RayTracerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RayTracerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return RayTracerParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g"; }



    	public Vector <double[]> spheres = new Vector <double []>();
    	public double [] ambientLight = new double [3];
    	public Vector <double []> ligths = new Vector <double[]>();
    	public String camera="";
    	public String num1="", num2="", num3="", num0="";
    	public String plane= "";
    	public String color= "";
    	public int typeObject = 0;
    	public boolean flag;
    	public static final int typePlane = 1;
    	public static final int typeSphere = 2;
    	public static final int typeCamera = 3;
    	public static final int typeLigth = 4;
    	public static final int typeAmbientalL=5;
    	


    // $ANTLR start "scene"
    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:21:1: scene : ambient_light ( object )+ ;
    public final void scene() throws RecognitionException {
        try {
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:21:7: ( ambient_light ( object )+ )
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:21:9: ambient_light ( object )+
            {
            pushFollow(FOLLOW_ambient_light_in_scene16);
            ambient_light();

            state._fsp--;

            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:21:23: ( object )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LIGHTSOURCE||LA1_0==CAMERA||LA1_0==SPHERE||LA1_0==PLANE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:21:23: object
            	    {
            	    pushFollow(FOLLOW_object_in_scene18);
            	    object();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "scene"


    // $ANTLR start "object"
    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:22:1: object : ( light | camera | ( sphere | plane ) );
    public final void object() throws RecognitionException {
        try {
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:22:8: ( light | camera | ( sphere | plane ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case LIGHTSOURCE:
                {
                alt3=1;
                }
                break;
            case CAMERA:
                {
                alt3=2;
                }
                break;
            case SPHERE:
            case PLANE:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:22:11: light
                    {
                    pushFollow(FOLLOW_light_in_object27);
                    light();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:22:19: camera
                    {
                    pushFollow(FOLLOW_camera_in_object31);
                    camera();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:22:28: ( sphere | plane )
                    {
                    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:22:28: ( sphere | plane )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==SPHERE) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==PLANE) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:22:29: sphere
                            {
                            pushFollow(FOLLOW_sphere_in_object36);
                            sphere();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:22:36: plane
                            {
                            pushFollow(FOLLOW_plane_in_object38);
                            plane();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "object"


    // $ANTLR start "light"
    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:23:1: light : LIGHTSOURCE OPEN_BRACKET coordenate3D COLOR color CLOSE_BRACKET ;
    public final void light() throws RecognitionException {
        try {
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:23:7: ( LIGHTSOURCE OPEN_BRACKET coordenate3D COLOR color CLOSE_BRACKET )
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:23:9: LIGHTSOURCE OPEN_BRACKET coordenate3D COLOR color CLOSE_BRACKET
            {
            typeObject=typeLigth;
            match(input,LIGHTSOURCE,FOLLOW_LIGHTSOURCE_in_light50); 
            match(input,OPEN_BRACKET,FOLLOW_OPEN_BRACKET_in_light52); 
            pushFollow(FOLLOW_coordenate3D_in_light54);
            coordenate3D();

            state._fsp--;

            match(input,COLOR,FOLLOW_COLOR_in_light56); 
            pushFollow(FOLLOW_color_in_light58);
            color();

            state._fsp--;

            match(input,CLOSE_BRACKET,FOLLOW_CLOSE_BRACKET_in_light60); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "light"


    // $ANTLR start "camera"
    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:27:1: camera : CAMERA OPEN_BRACKET LOCATION coordenate= coordenate3D LOOK_AT coordenate2= coordenate3D CLOSE_BRACKET ;
    public final void camera() throws RecognitionException {
        RayTracerParser.coordenate3D_return coordenate = null;

        RayTracerParser.coordenate3D_return coordenate2 = null;


        try {
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:27:8: ( CAMERA OPEN_BRACKET LOCATION coordenate= coordenate3D LOOK_AT coordenate2= coordenate3D CLOSE_BRACKET )
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:27:10: CAMERA OPEN_BRACKET LOCATION coordenate= coordenate3D LOOK_AT coordenate2= coordenate3D CLOSE_BRACKET
            {
            camera += "camara = " + "position ";
            match(input,CAMERA,FOLLOW_CAMERA_in_camera75); 
            match(input,OPEN_BRACKET,FOLLOW_OPEN_BRACKET_in_camera77); 
            match(input,LOCATION,FOLLOW_LOCATION_in_camera79); 
            pushFollow(FOLLOW_coordenate3D_in_camera83);
            coordenate=coordenate3D();

            state._fsp--;

            camera += (coordenate!=null?input.toString(coordenate.start,coordenate.stop):null) + ", lookat ";
            		
            match(input,LOOK_AT,FOLLOW_LOOK_AT_in_camera92); 
            pushFollow(FOLLOW_coordenate3D_in_camera96);
            coordenate2=coordenate3D();

            state._fsp--;


            		camera +=(coordenate2!=null?input.toString(coordenate2.start,coordenate2.stop):null) + ";";
            		System.out.println(camera);
            match(input,CLOSE_BRACKET,FOLLOW_CLOSE_BRACKET_in_camera100); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "camera"


    // $ANTLR start "sphere"
    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:34:1: sphere : SPHERE OPEN_BRACKET coordenate3D COMMA number pigment ( constantLights )? CLOSE_BRACKET ;
    public final void sphere() throws RecognitionException {
        RayTracerParser.number_return number1 = null;


        try {
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:34:8: ( SPHERE OPEN_BRACKET coordenate3D COMMA number pigment ( constantLights )? CLOSE_BRACKET )
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:34:10: SPHERE OPEN_BRACKET coordenate3D COMMA number pigment ( constantLights )? CLOSE_BRACKET
            {
            typeObject=typeSphere;
            		flag=false;
            match(input,SPHERE,FOLLOW_SPHERE_in_sphere111); 
            match(input,OPEN_BRACKET,FOLLOW_OPEN_BRACKET_in_sphere113); 
            pushFollow(FOLLOW_coordenate3D_in_sphere115);
            coordenate3D();

            state._fsp--;

            match(input,COMMA,FOLLOW_COMMA_in_sphere123); 
            pushFollow(FOLLOW_number_in_sphere125);
            number1=number();

            state._fsp--;


            		double [] tempRadio= new double [1];
            		tempRadio [0] = Double.valueOf((number1!=null?input.toString(number1.start,number1.stop):null)).doubleValue();
            		spheres.add (tempRadio);
            		/*sphere+= (number1!=null?input.toString(number1.start,number1.stop):null) + ", ";*/
            pushFollow(FOLLOW_pigment_in_sphere133);
            pigment();

            state._fsp--;

            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:44:11: ( constantLights )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:44:12: constantLights
                    {
                    pushFollow(FOLLOW_constantLights_in_sphere136);
                    constantLights();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CLOSE_BRACKET,FOLLOW_CLOSE_BRACKET_in_sphere140); 
            if(!flag){
            		  double [] temp = new double [4];
            		  temp [0]=0.1;
            		  temp [1]=0.7;
            		  temp [2]= 0.7;
            		  temp [3] = 20.0;
            		  spheres.add(temp);}
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "sphere"


    // $ANTLR start "plane"
    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:53:1: plane : PLANE OPEN_BRACKET coordenate3D COMMA number pigment ( constantLights )? CLOSE_BRACKET ;
    public final void plane() throws RecognitionException {
        RayTracerParser.coordenate3D_return coordenate3D2 = null;

        RayTracerParser.number_return number3 = null;


        try {
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:53:8: ( PLANE OPEN_BRACKET coordenate3D COMMA number pigment ( constantLights )? CLOSE_BRACKET )
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:53:10: PLANE OPEN_BRACKET coordenate3D COMMA number pigment ( constantLights )? CLOSE_BRACKET
            {
            typeObject=typePlane;
            		plane+= "plano = ";
            match(input,PLANE,FOLLOW_PLANE_in_plane156); 
            match(input,OPEN_BRACKET,FOLLOW_OPEN_BRACKET_in_plane158); 
            pushFollow(FOLLOW_coordenate3D_in_plane160);
            coordenate3D2=coordenate3D();

            state._fsp--;

            plane+= (coordenate3D2!=null?input.toString(coordenate3D2.start,coordenate3D2.stop):null)+ ", ";
            match(input,COMMA,FOLLOW_COMMA_in_plane168); 
            pushFollow(FOLLOW_number_in_plane170);
            number3=number();

            state._fsp--;

            plane+= (number3!=null?input.toString(number3.start,number3.stop):null) + ", ";
            pushFollow(FOLLOW_pigment_in_plane178);
            pigment();

            state._fsp--;

            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:59:11: ( constantLights )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:59:12: constantLights
                    {
                    pushFollow(FOLLOW_constantLights_in_plane181);
                    constantLights();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CLOSE_BRACKET,FOLLOW_CLOSE_BRACKET_in_plane185); 
            System.out.println(plane);
            		plane="";

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "plane"


    // $ANTLR start "pigment"
    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:62:1: pigment : PIGMENT OPEN_BRACKET COLOR color CLOSE_BRACKET ;
    public final void pigment() throws RecognitionException {
        RayTracerParser.color_return color4 = null;


        try {
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:62:9: ( PIGMENT OPEN_BRACKET COLOR color CLOSE_BRACKET )
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:62:11: PIGMENT OPEN_BRACKET COLOR color CLOSE_BRACKET
            {
            match(input,PIGMENT,FOLLOW_PIGMENT_in_pigment196); 
            match(input,OPEN_BRACKET,FOLLOW_OPEN_BRACKET_in_pigment198); 
            match(input,COLOR,FOLLOW_COLOR_in_pigment200); 
            pushFollow(FOLLOW_color_in_pigment202);
            color4=color();

            state._fsp--;

            match(input,CLOSE_BRACKET,FOLLOW_CLOSE_BRACKET_in_pigment204); 
            color+= (color4!=null?input.toString(color4.start,color4.stop):null);
            		 double [] color1 = new double [3]; 
            		
            		// Para determinar el color
            		if (color.equals("Yellow"))
            		{
            		color1 [0] = 1.0; color1 [1] =1.0; color1 [2] = 0.0;
            		} else if (color.equals("Blue"))
            		 {color1 [0] = 0.0; color1 [1] =0.0; color1 [2] = 1.0;
            		} else if (color.equals("Red"))
            		{  color1 [0] = 1.0; color1 [1] =0.0; color1 [2] = 0.0;
            		} else if (color.equals("Green"))
            		 {color1 [0] = 0.0; color1 [1] =1.0; color1 [2] = 0.0;
            		} else if (color.equals("White"))
            		 {color1 [0] = 1.0; color1 [1] =1.0; color1 [2] = 1.0;}
            		 color = ""; 
            		 
            		 // Para saber a que vector se agrega
            		  switch (typeObject){
            		    case 1:
            		      break;
            		   case 2:
            		    spheres.add(color1);
            		   case 3:
            		    break;
            		   case 4:
            		    ligths.add(color1);
            		    break;} 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pigment"

    public static class coordenate3D_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "coordenate3D"
    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:91:1: coordenate3D : LESS_THAN num1= number COMMA num2= number COMMA num3= number GREATER_THAN ;
    public final RayTracerParser.coordenate3D_return coordenate3D() throws RecognitionException {
        RayTracerParser.coordenate3D_return retval = new RayTracerParser.coordenate3D_return();
        retval.start = input.LT(1);

        RayTracerParser.number_return num1 = null;

        RayTracerParser.number_return num2 = null;

        RayTracerParser.number_return num3 = null;


        try {
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:92:2: ( LESS_THAN num1= number COMMA num2= number COMMA num3= number GREATER_THAN )
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:92:4: LESS_THAN num1= number COMMA num2= number COMMA num3= number GREATER_THAN
            {
            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_coordenate3D216); 
            pushFollow(FOLLOW_number_in_coordenate3D220);
            num1=number();

            state._fsp--;

            match(input,COMMA,FOLLOW_COMMA_in_coordenate3D222); 
            pushFollow(FOLLOW_number_in_coordenate3D226);
            num2=number();

            state._fsp--;

            match(input,COMMA,FOLLOW_COMMA_in_coordenate3D228); 
            pushFollow(FOLLOW_number_in_coordenate3D232);
            num3=number();

            state._fsp--;

            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_coordenate3D234); 
             double [] temp = new double [3];
            		  temp [0]=Double.valueOf((num1!=null?input.toString(num1.start,num1.stop):null)).doubleValue();
            		  temp [1]= Double.valueOf((num2!=null?input.toString(num2.start,num2.stop):null)).doubleValue();
            		  temp [2] = Double.valueOf((num3!=null?input.toString(num3.start,num3.stop):null)).doubleValue();
            		  switch (typeObject){
            			case 1:
            			  break;
            			case 2:
            			 spheres.add(temp);
            			  break;
            			case 3:
            			 break;
            			case 4:
            			 ligths.add(temp);
            			 break;
            			case 5:
             			 break;}
            		

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "coordenate3D"

    public static class number_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "number"
    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:111:1: number : ( '-' )? DIGIT ( '.' )? ( DIGIT )* ;
    public final RayTracerParser.number_return number() throws RecognitionException {
        RayTracerParser.number_return retval = new RayTracerParser.number_return();
        retval.start = input.LT(1);

        try {
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:111:8: ( ( '-' )? DIGIT ( '.' )? ( DIGIT )* )
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:111:10: ( '-' )? DIGIT ( '.' )? ( DIGIT )*
            {
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:111:10: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:111:11: '-'
                    {
                    match(input,23,FOLLOW_23_in_number246); 

                    }
                    break;

            }

            match(input,DIGIT,FOLLOW_DIGIT_in_number250); 
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:111:23: ( '.' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:111:24: '.'
                    {
                    match(input,24,FOLLOW_24_in_number253); 

                    }
                    break;

            }

            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:111:30: ( DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DIGIT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:111:30: DIGIT
            	    {
            	    match(input,DIGIT,FOLLOW_DIGIT_in_number257); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class color_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "color"
    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:112:1: color : TYPE_COLOR ;
    public final RayTracerParser.color_return color() throws RecognitionException {
        RayTracerParser.color_return retval = new RayTracerParser.color_return();
        retval.start = input.LT(1);

        Token TYPE_COLOR5=null;

        try {
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:112:7: ( TYPE_COLOR )
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:112:9: TYPE_COLOR
            {
            TYPE_COLOR5=(Token)match(input,TYPE_COLOR,FOLLOW_TYPE_COLOR_in_color265); 
            color+= (TYPE_COLOR5!=null?TYPE_COLOR5.getText():null);
            		 double [] color1 = new double [3]; 
            		 if (color.equals("Yellow"))														{
            			color1 [0] = 1.0; color1 [1] =1.0; color1 [2] = 0.0;
            		} else if (color.equals("Blue"))
            			 {color1 [0] = 0.0; color1 [1] =0.0; color1 [2] = 1.0;
            		} else if (color.equals("Red"))														{  color1 [0] = 1.0; color1 [1] =0.0; color1 [2] = 0.0;											} else if (color.equals("Green"))
            			{color1 [0] = 0.0; color1 [1] =1.0; color1 [2] = 0.0;
            		} else if (color.equals("White"))
            			{color1 [0] = 1.0; color1 [1] =1.0; color1 [2] = 1.0;}
            		color = ""; 
            		switch (typeObject){
            		   case 4:
            		    ligths.add(color1);
            		    break;
            		   case 5:
            		    for (int i=0; i<3; i++){	
               		     ambientLight[i]=color1[i];}
            		   break;
            		   default:
            		    break;}

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "color"


    // $ANTLR start "ambient_light"
    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:134:1: ambient_light : GLOBAL OPEN_BRACKET AMBIENTLIGHT COLOR color CLOSE_BRACKET ;
    public final void ambient_light() throws RecognitionException {
        try {
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:134:15: ( GLOBAL OPEN_BRACKET AMBIENTLIGHT COLOR color CLOSE_BRACKET )
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:134:16: GLOBAL OPEN_BRACKET AMBIENTLIGHT COLOR color CLOSE_BRACKET
            {
            typeObject=typeAmbientalL;
            match(input,GLOBAL,FOLLOW_GLOBAL_in_ambient_light280); 
            match(input,OPEN_BRACKET,FOLLOW_OPEN_BRACKET_in_ambient_light282); 
            match(input,AMBIENTLIGHT,FOLLOW_AMBIENTLIGHT_in_ambient_light284); 
            match(input,COLOR,FOLLOW_COLOR_in_ambient_light286); 
            pushFollow(FOLLOW_color_in_ambient_light288);
            color();

            state._fsp--;

            match(input,CLOSE_BRACKET,FOLLOW_CLOSE_BRACKET_in_ambient_light290); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ambient_light"


    // $ANTLR start "constantLights"
    // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:136:1: constantLights : 'finish' OPEN_BRACKET 'ambient' num0= number 'diffuse' num1= number 'phong' num2= number 'phong_size' num3= number CLOSE_BRACKET ;
    public final void constantLights() throws RecognitionException {
        RayTracerParser.number_return num0 = null;

        RayTracerParser.number_return num1 = null;

        RayTracerParser.number_return num2 = null;

        RayTracerParser.number_return num3 = null;


        try {
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:137:2: ( 'finish' OPEN_BRACKET 'ambient' num0= number 'diffuse' num1= number 'phong' num2= number 'phong_size' num3= number CLOSE_BRACKET )
            // D:\\Pamela\\Quinto semestre\\Computaci�n  Gr�fica\\RayTracer\\RayTracer.g:137:3: 'finish' OPEN_BRACKET 'ambient' num0= number 'diffuse' num1= number 'phong' num2= number 'phong_size' num3= number CLOSE_BRACKET
            {
            flag=true;
            match(input,25,FOLLOW_25_in_constantLights314); 
            match(input,OPEN_BRACKET,FOLLOW_OPEN_BRACKET_in_constantLights316); 
            match(input,26,FOLLOW_26_in_constantLights318); 
            pushFollow(FOLLOW_number_in_constantLights322);
            num0=number();

            state._fsp--;

            match(input,27,FOLLOW_27_in_constantLights324); 
            pushFollow(FOLLOW_number_in_constantLights328);
            num1=number();

            state._fsp--;

            match(input,28,FOLLOW_28_in_constantLights330); 
            pushFollow(FOLLOW_number_in_constantLights334);
            num2=number();

            state._fsp--;

            match(input,29,FOLLOW_29_in_constantLights336); 
            pushFollow(FOLLOW_number_in_constantLights340);
            num3=number();

            state._fsp--;

            match(input,CLOSE_BRACKET,FOLLOW_CLOSE_BRACKET_in_constantLights342); 

            	   double [] temp = new double [4];
            	   temp [0]=Double.valueOf((num0!=null?input.toString(num0.start,num0.stop):null)).doubleValue();
            	   temp [1]= Double.valueOf((num1!=null?input.toString(num1.start,num1.stop):null)).doubleValue();
            	   temp [2] = Double.valueOf((num2!=null?input.toString(num2.start,num2.stop):null)).doubleValue();
            	   temp [3]=Double.valueOf((num3!=null?input.toString(num3.start,num3.stop):null)).doubleValue();
            	    switch (typeObject)
            	    {
            	    case 1:
            	      break;
            	    case 2:
            	      spheres.add(temp);
            	      break;
            	    case 3:
            	      break;
            	    case 4:
            	      break;
            	    case 5:
            	      break;
            	    }
            	  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constantLights"

    // Delegated rules


 

    public static final BitSet FOLLOW_ambient_light_in_scene16 = new BitSet(new long[]{0x0000000000002910L});
    public static final BitSet FOLLOW_object_in_scene18 = new BitSet(new long[]{0x0000000000002912L});
    public static final BitSet FOLLOW_light_in_object27 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_camera_in_object31 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sphere_in_object36 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plane_in_object38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIGHTSOURCE_in_light50 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPEN_BRACKET_in_light52 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_coordenate3D_in_light54 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COLOR_in_light56 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_color_in_light58 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CLOSE_BRACKET_in_light60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAMERA_in_camera75 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPEN_BRACKET_in_camera77 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_LOCATION_in_camera79 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_coordenate3D_in_camera83 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LOOK_AT_in_camera92 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_coordenate3D_in_camera96 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CLOSE_BRACKET_in_camera100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPHERE_in_sphere111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPEN_BRACKET_in_sphere113 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_coordenate3D_in_sphere115 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COMMA_in_sphere123 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_number_in_sphere125 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_pigment_in_sphere133 = new BitSet(new long[]{0x0000000002000080L});
    public static final BitSet FOLLOW_constantLights_in_sphere136 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CLOSE_BRACKET_in_sphere140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLANE_in_plane156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPEN_BRACKET_in_plane158 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_coordenate3D_in_plane160 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COMMA_in_plane168 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_number_in_plane170 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_pigment_in_plane178 = new BitSet(new long[]{0x0000000002000080L});
    public static final BitSet FOLLOW_constantLights_in_plane181 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CLOSE_BRACKET_in_plane185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PIGMENT_in_pigment196 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPEN_BRACKET_in_pigment198 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COLOR_in_pigment200 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_color_in_pigment202 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CLOSE_BRACKET_in_pigment204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_coordenate3D216 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_number_in_coordenate3D220 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COMMA_in_coordenate3D222 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_number_in_coordenate3D226 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COMMA_in_coordenate3D228 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_number_in_coordenate3D232 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_GREATER_THAN_in_coordenate3D234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_number246 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DIGIT_in_number250 = new BitSet(new long[]{0x0000000001020002L});
    public static final BitSet FOLLOW_24_in_number253 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_DIGIT_in_number257 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_TYPE_COLOR_in_color265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GLOBAL_in_ambient_light280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPEN_BRACKET_in_ambient_light282 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_AMBIENTLIGHT_in_ambient_light284 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COLOR_in_ambient_light286 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_color_in_ambient_light288 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CLOSE_BRACKET_in_ambient_light290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_constantLights314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPEN_BRACKET_in_constantLights316 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_constantLights318 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_number_in_constantLights322 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_constantLights324 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_number_in_constantLights328 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_constantLights330 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_number_in_constantLights334 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_constantLights336 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_number_in_constantLights340 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CLOSE_BRACKET_in_constantLights342 = new BitSet(new long[]{0x0000000000000002L});

}