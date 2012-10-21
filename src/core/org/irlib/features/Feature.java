/**
 * 
 */
package org.irlib.features;

import org.terrier.matching.MatchingQueryTerms;
import org.terrier.structures.Index;

/**
 * @author semanticpc
 * 
 */
public abstract class Feature {
  protected boolean SPECIAL_INPUTS = false;
  protected Index index;
  
  public Feature(Index _index) {
    index = _index;
  }
  
  /**
   * Compute the feature value for the given element. Element is a query while
   * using Query Feature Vector and its a document while using Document Feature
   * Vector
   * 
   * @return
   */
  public abstract double computeValue();
  
  public void setUp(MatchingQueryTerms _terms) {
    setUp(null, _terms);
  }
  
  public abstract void setUp(int[] _docids, MatchingQueryTerms _terms);
}
