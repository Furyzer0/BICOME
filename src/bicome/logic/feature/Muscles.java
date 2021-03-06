package bicome.logic.feature;
/**
 * Determines muscle amount & size
 * Dominant: Heavy Muscles
 * Recessive: Light Muscles -> has no effect on anything
 * None: Almost No Muscles
 * @author Ege Balcioglu
 * @version 23.4.2018
 */
import bicome.logic.genotype.Genotype;
import bicome.logic.attribute.*;
import java.util.HashMap;
public final class Muscles extends FeatureBase
{
   private static Muscles instance;
   
   private Muscles()
   {
      super();
   }
   
   /**
    * Gets the instance of this class according to the singleton pattern
    * @return the instance of this class
    */
   public static FeatureBase getInstance()
   {
      if ( instance == null )
         instance = new Muscles();
      return instance;
   }
   
   @Override
   protected void setMultipliers()
   {
      this.dominantMultipliers.put( "water_stockpiling", 0.78 );
      this.dominantMultipliers.put( "power", 1.90 );
      this.noneMultipliers.put( "power", 0.50 );
      this.dominantMultipliers.put( "speed", 0.70 );
      this.noneMultipliers.put( "speed", 1.45 );
   }
      
   @Override
   protected String getFeatureName( Genotype g )
   {
      StringBuffer result = new StringBuffer( "" );
      if ( g == Genotype.NONE )
         result.append( "No " );
      else if ( g == Genotype.RECESSIVE_HOMOZYGOTE )
         result.append( "Light " );
      else
         result.append( "Heavy " );
      result.append( "Muscles" );
      return result.toString();
   }
}
