package environment;
/**
 * @author Ege Balc�o�lu
 * @version 24.4.2018
 */
import java.util.HashMap;
import feature.Feature;
public abstract class EnvironmentalCondition
{
   protected HashMap< Feature, Double > multipliers;
   
   public EnvironmentalCondition()
   {
      multipliers = new HashMap<>();
      setMultipliers();
   }
   
   public HashMap< Feature, Double > getMultipliers()
   {
      return multipliers;
   }
   
   protected abstract void setMultipliers();
}