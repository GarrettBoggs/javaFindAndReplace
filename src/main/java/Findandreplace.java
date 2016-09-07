class Findandreplace {

  public String mStartString;
  public String mFind;
  public String mReplace;
  public String mEndString;

  public Findandreplace(String startString, String finder, String replacer) {
    mStartString = startString;
    mFind = finder;
    mReplace = replacer;
  }

  public String runFindAndReplace() {
    mEndString = mStartString.replaceAll("(?i)" + mFind, mReplace);
    return mEndString;
  }
}
