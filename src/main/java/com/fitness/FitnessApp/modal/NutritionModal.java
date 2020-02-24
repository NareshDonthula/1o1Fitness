package com.fitness.FitnessApp.modal;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "nutrition_search")
public class NutritionModal {
	int foodId;
	String catagory1;
	String catagory2;
	String quantity;
	String units;
	String foodCode;
	String foodName;
	double protein;
	double carboHydrate;
	double totalFibre;
	double solubleFibre;
	double insolubleFibre;
	double totalFat;
	double energy;
	double thiamine;
	double riboFlavin;
	double niacin;
	double pantothenicAcid;
	double totalPyridoxine;
	double biotin;
	double totalFolates;
	double totalAscorbicAcid;
	double ergoCalciferol;
	double tocopherolsAlpha;
	double tocopherolsBeta;
	double tocopherolsGamma;
	double tocopherolEquivalent;
	double phylloQuinones;
	double tocopherolsDelta;
	double tocotrienolsAlpha;
	double tocotrienolsBeta;
	double tocotrienolsGamma;
	double tocotrienolsDelta;
	double menaQuinones;
	double a25OHD3;
	double lutein;
	double zeaxanthin;
	double betaCarotene;
	double totalCarotenoids;
	double cryptoxanthin;
	double alphaCarotene;
	double gammaCarotene;
	double lycopene;
	double aluminium;
	double arsenic;
	double cadmium;
	double calcium;
	double chromium;
	double cobalt;
	double copper;
	double Iron;
	double lead;
	double lithium;
	double magnesium;
	double manganese;
	double mercury;
	double molebdenum;
	double nickel;
	double phosphorus;
	double pottasium;
	double selenium;
	double sodium;
	double zinc;
	double totalAvailableCHO;
	double totalStarch;
	double fructose;
	double glucose;
	double sucrose;
	double maltose;
	double totalFreeSugars;
	double capric;
	double undecanoic;
	double lauric;
	double myristic;
	double pentaDecanoic;
	double palmitic;
	double stearic;
	double arachidic;
	double behenic;
	double lignoceric;
	double myristoleic;
	double palmitoleic;
	double oleic;
	double eicosenoic;
	double erucic;
	double nervonic;
	double linoleic;
	double eicosadienoic;
	double docosadienoic;
	double linolenicAlpha;
	double eicosaTrienoic;
	double arachiDonic;
	double eicosaPentaenoic;
	double docosaPentaenoic;
	double docosaHexaenoic;
	double totalSaturatedFattyAcids;
	double totalMonoUnsaturatedFattyAcids;
	double totalPolyUnsaturatedFattyAcids;
	double cholesterol;
	double histiDine;
	double isoleucine;
	double luecine;
	double lysine;
	double methoIonine;
	double cyStine;
	double phenyLalanine;
	double threoNine;
	double tryptoPhan;
	double vaLine;
	double alaNine;
	double argiNine;
	double asparticAcid;
	double glutamic_Acid;
	double glycine;
	double proLine;
	double serine;
	double tyrosine;
	double totalOxalate;
	double solubleOxalate;
	double insolubleOxalate;
	double cisAconiticAcid;
	double citricAcid;
	double fumaricAcid;
	double mallicAcid;
	double quinicAcid;
	double succinicAcid;
	double tartaricAcid;
	double dihydroxyBenzoicAcid;
	double hydroxyBenzaldehyde;
	double protocatechuicAcid;
	double vanillicAcid;
	double gallicAcid;
	double cinnamicAcid;
	double coumaricAcidO;
	double coumaricAcidP;
	double caffeicAcid;
	double chlorogenicAcid;
	double ferulicAcid;
	double apigenin;
	double apigenin6cGlucoside;
	double apigenin7oNeohesperidoside;
	double luteOlin;
	double kaempFerol;
	double querCetin;
	double quercetin3dGlucoside;
	double quercetin3oRutinoside;
	double quercetin3Galactoside;
	double isorHamnetin;
	double myriCetin;
	double resveRatrol;
	double hesPeretin;
	double narinGenin;
	double hesPeredin;
	double daidZein;
	double geniStein;
	double epicaTechin;
	double epigalloCatechin;
	double epigalloCatechin3Gallate;
	double catechin;
	double gallocatechinGallate;
	double galloCatechin;
	double syringicAcid;
	double sinapinicAcid;
	double ellagicAcid;
	double totalPolyphenols;
	double oligosaccharidesRaffinose;
	double oligosaccharidesStachyose;
	double oligosaccharidesVerbascose;
	double oligosaccharidesAjugose;
	double phytosterolsCampesterol;
	double phytosterolsStigmasterol;
	double phytosterolsSitosterol;
	double phytate;
	double totalSaponin;
	double butyric;
	double caproic;
	double caprylic;
	String imgUrl;

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getCatagory1() {
		return catagory1;
	}

	public void setCatagory1(String catagory1) {
		this.catagory1 = catagory1;
	}

	public String getCatagory2() {
		return catagory2;
	}

	public void setCatagory2(String catagory2) {
		this.catagory2 = catagory2;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getFoodCode() {
		return foodCode;
	}

	public void setFoodCode(String foodCode) {
		this.foodCode = foodCode;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getCarboHydrate() {
		return carboHydrate;
	}

	public void setCarboHydrate(double carboHydrate) {
		this.carboHydrate = carboHydrate;
	}

	public double getTotalFibre() {
		return totalFibre;
	}

	public void setTotalFibre(double totalFibre) {
		this.totalFibre = totalFibre;
	}

	public double getSolubleFibre() {
		return solubleFibre;
	}

	public void setSolubleFibre(double solubleFibre) {
		this.solubleFibre = solubleFibre;
	}

	public double getInsolubleFibre() {
		return insolubleFibre;
	}

	public void setInsolubleFibre(double insolubleFibre) {
		this.insolubleFibre = insolubleFibre;
	}

	public double getTotalFat() {
		return totalFat;
	}

	public void setTotalFat(double totalFat) {
		this.totalFat = totalFat;
	}

	public double getEnergy() {
		return energy;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}

	public double getThiamine() {
		return thiamine;
	}

	public void setThiamine(double thiamine) {
		this.thiamine = thiamine;
	}

	public double getRiboFlavin() {
		return riboFlavin;
	}

	public void setRiboFlavin(double riboFlavin) {
		this.riboFlavin = riboFlavin;
	}

	public double getNiacin() {
		return niacin;
	}

	public void setNiacin(double niacin) {
		this.niacin = niacin;
	}

	public double getPantothenicAcid() {
		return pantothenicAcid;
	}

	public void setPantothenicAcid(double pantothenicAcid) {
		this.pantothenicAcid = pantothenicAcid;
	}

	public double getTotalPyridoxine() {
		return totalPyridoxine;
	}

	public void setTotalPyridoxine(double totalPyridoxine) {
		this.totalPyridoxine = totalPyridoxine;
	}

	public double getBiotin() {
		return biotin;
	}

	public void setBiotin(double biotin) {
		this.biotin = biotin;
	}

	public double getTotalFolates() {
		return totalFolates;
	}

	public void setTotalFolates(double totalFolates) {
		this.totalFolates = totalFolates;
	}

	public double getTotalAscorbicAcid() {
		return totalAscorbicAcid;
	}

	public void setTotalAscorbicAcid(double totalAscorbicAcid) {
		this.totalAscorbicAcid = totalAscorbicAcid;
	}

	public double getErgoCalciferol() {
		return ergoCalciferol;
	}

	public void setErgoCalciferol(double ergoCalciferol) {
		this.ergoCalciferol = ergoCalciferol;
	}

	public double getTocopherolsAlpha() {
		return tocopherolsAlpha;
	}

	public void setTocopherolsAlpha(double tocopherolsAlpha) {
		this.tocopherolsAlpha = tocopherolsAlpha;
	}

	public double getTocopherolsBeta() {
		return tocopherolsBeta;
	}

	public void setTocopherolsBeta(double tocopherolsBeta) {
		this.tocopherolsBeta = tocopherolsBeta;
	}

	public double getTocopherolsGamma() {
		return tocopherolsGamma;
	}

	public void setTocopherolsGamma(double tocopherolsGamma) {
		this.tocopherolsGamma = tocopherolsGamma;
	}

	public double getTocopherolEquivalent() {
		return tocopherolEquivalent;
	}

	public void setTocopherolEquivalent(double tocopherolEquivalent) {
		this.tocopherolEquivalent = tocopherolEquivalent;
	}

	public double getPhylloQuinones() {
		return phylloQuinones;
	}

	public void setPhylloQuinones(double phylloQuinones) {
		this.phylloQuinones = phylloQuinones;
	}

	public double getTocopherolsDelta() {
		return tocopherolsDelta;
	}

	public void setTocopherolsDelta(double tocopherolsDelta) {
		this.tocopherolsDelta = tocopherolsDelta;
	}

	public double getTocotrienolsAlpha() {
		return tocotrienolsAlpha;
	}

	public void setTocotrienolsAlpha(double tocotrienolsAlpha) {
		this.tocotrienolsAlpha = tocotrienolsAlpha;
	}

	public double getTocotrienolsBeta() {
		return tocotrienolsBeta;
	}

	public void setTocotrienolsBeta(double tocotrienolsBeta) {
		this.tocotrienolsBeta = tocotrienolsBeta;
	}

	public double getTocotrienolsGamma() {
		return tocotrienolsGamma;
	}

	public void setTocotrienolsGamma(double tocotrienolsGamma) {
		this.tocotrienolsGamma = tocotrienolsGamma;
	}

	public double getTocotrienolsDelta() {
		return tocotrienolsDelta;
	}

	public void setTocotrienolsDelta(double tocotrienolsDelta) {
		this.tocotrienolsDelta = tocotrienolsDelta;
	}

	public double getMenaQuinones() {
		return menaQuinones;
	}

	public void setMenaQuinones(double menaQuinones) {
		this.menaQuinones = menaQuinones;
	}

	public double getA25OHD3() {
		return a25OHD3;
	}

	public void setA25OHD3(double a25ohd3) {
		a25OHD3 = a25ohd3;
	}

	public double getLutein() {
		return lutein;
	}

	public void setLutein(double lutein) {
		this.lutein = lutein;
	}

	public double getZeaxanthin() {
		return zeaxanthin;
	}

	public void setZeaxanthin(double zeaxanthin) {
		this.zeaxanthin = zeaxanthin;
	}

	public double getBetaCarotene() {
		return betaCarotene;
	}

	public void setBetaCarotene(double betaCarotene) {
		this.betaCarotene = betaCarotene;
	}

	public double getTotalCarotenoids() {
		return totalCarotenoids;
	}

	public void setTotalCarotenoids(double totalCarotenoids) {
		this.totalCarotenoids = totalCarotenoids;
	}

	public double getCryptoxanthin() {
		return cryptoxanthin;
	}

	public void setCryptoxanthin(double cryptoxanthin) {
		this.cryptoxanthin = cryptoxanthin;
	}

	public double getAlphaCarotene() {
		return alphaCarotene;
	}

	public void setAlphaCarotene(double alphaCarotene) {
		this.alphaCarotene = alphaCarotene;
	}

	public double getGammaCarotene() {
		return gammaCarotene;
	}

	public void setGammaCarotene(double gammaCarotene) {
		this.gammaCarotene = gammaCarotene;
	}

	public double getLycopene() {
		return lycopene;
	}

	public void setLycopene(double lycopene) {
		this.lycopene = lycopene;
	}

	public double getAluminium() {
		return aluminium;
	}

	public void setAluminium(double aluminium) {
		this.aluminium = aluminium;
	}

	public double getArsenic() {
		return arsenic;
	}

	public void setArsenic(double arsenic) {
		this.arsenic = arsenic;
	}

	public double getCadmium() {
		return cadmium;
	}

	public void setCadmium(double cadmium) {
		this.cadmium = cadmium;
	}

	public double getCalcium() {
		return calcium;
	}

	public void setCalcium(double calcium) {
		this.calcium = calcium;
	}

	public double getChromium() {
		return chromium;
	}

	public void setChromium(double chromium) {
		this.chromium = chromium;
	}

	public double getCobalt() {
		return cobalt;
	}

	public void setCobalt(double cobalt) {
		this.cobalt = cobalt;
	}

	public double getCopper() {
		return copper;
	}

	public void setCopper(double copper) {
		this.copper = copper;
	}

	public double getIron() {
		return Iron;
	}

	public void setIron(double iron) {
		Iron = iron;
	}

	public double getLead() {
		return lead;
	}

	public void setLead(double lead) {
		this.lead = lead;
	}

	public double getLithium() {
		return lithium;
	}

	public void setLithium(double lithium) {
		this.lithium = lithium;
	}

	public double getMagnesium() {
		return magnesium;
	}

	public void setMagnesium(double magnesium) {
		this.magnesium = magnesium;
	}

	public double getManganese() {
		return manganese;
	}

	public void setManganese(double manganese) {
		this.manganese = manganese;
	}

	public double getMercury() {
		return mercury;
	}

	public void setMercury(double mercury) {
		this.mercury = mercury;
	}

	public double getMolebdenum() {
		return molebdenum;
	}

	public void setMolebdenum(double molebdenum) {
		this.molebdenum = molebdenum;
	}

	public double getNickel() {
		return nickel;
	}

	public void setNickel(double nickel) {
		this.nickel = nickel;
	}

	public double getPhosphorus() {
		return phosphorus;
	}

	public void setPhosphorus(double phosphorus) {
		this.phosphorus = phosphorus;
	}

	public double getPottasium() {
		return pottasium;
	}

	public void setPottasium(double pottasium) {
		this.pottasium = pottasium;
	}

	public double getSelenium() {
		return selenium;
	}

	public void setSelenium(double selenium) {
		this.selenium = selenium;
	}

	public double getSodium() {
		return sodium;
	}

	public void setSodium(double sodium) {
		this.sodium = sodium;
	}

	public double getZinc() {
		return zinc;
	}

	public void setZinc(double zinc) {
		this.zinc = zinc;
	}

	public double getTotalAvailableCHO() {
		return totalAvailableCHO;
	}

	public void setTotalAvailableCHO(double totalAvailableCHO) {
		this.totalAvailableCHO = totalAvailableCHO;
	}

	public double getTotalStarch() {
		return totalStarch;
	}

	public void setTotalStarch(double totalStarch) {
		this.totalStarch = totalStarch;
	}

	public double getFructose() {
		return fructose;
	}

	public void setFructose(double fructose) {
		this.fructose = fructose;
	}

	public double getGlucose() {
		return glucose;
	}

	public void setGlucose(double glucose) {
		this.glucose = glucose;
	}

	public double getSucrose() {
		return sucrose;
	}

	public void setSucrose(double sucrose) {
		this.sucrose = sucrose;
	}

	public double getMaltose() {
		return maltose;
	}

	public void setMaltose(double maltose) {
		this.maltose = maltose;
	}

	public double getTotalFreeSugars() {
		return totalFreeSugars;
	}

	public void setTotalFreeSugars(double totalFreeSugars) {
		this.totalFreeSugars = totalFreeSugars;
	}

	public double getCapric() {
		return capric;
	}

	public void setCapric(double capric) {
		this.capric = capric;
	}

	public double getUndecanoic() {
		return undecanoic;
	}

	public void setUndecanoic(double undecanoic) {
		this.undecanoic = undecanoic;
	}

	public double getLauric() {
		return lauric;
	}

	public void setLauric(double lauric) {
		this.lauric = lauric;
	}

	public double getMyristic() {
		return myristic;
	}

	public void setMyristic(double myristic) {
		this.myristic = myristic;
	}

	public double getPentaDecanoic() {
		return pentaDecanoic;
	}

	public void setPentaDecanoic(double pentaDecanoic) {
		this.pentaDecanoic = pentaDecanoic;
	}

	public double getPalmitic() {
		return palmitic;
	}

	public void setPalmitic(double palmitic) {
		this.palmitic = palmitic;
	}

	public double getStearic() {
		return stearic;
	}

	public void setStearic(double stearic) {
		this.stearic = stearic;
	}

	public double getArachidic() {
		return arachidic;
	}

	public void setArachidic(double arachidic) {
		this.arachidic = arachidic;
	}

	public double getBehenic() {
		return behenic;
	}

	public void setBehenic(double behenic) {
		this.behenic = behenic;
	}

	public double getLignoceric() {
		return lignoceric;
	}

	public void setLignoceric(double lignoceric) {
		this.lignoceric = lignoceric;
	}

	public double getMyristoleic() {
		return myristoleic;
	}

	public void setMyristoleic(double myristoleic) {
		this.myristoleic = myristoleic;
	}

	public double getPalmitoleic() {
		return palmitoleic;
	}

	public void setPalmitoleic(double palmitoleic) {
		this.palmitoleic = palmitoleic;
	}

	public double getOleic() {
		return oleic;
	}

	public void setOleic(double oleic) {
		this.oleic = oleic;
	}

	public double getEicosenoic() {
		return eicosenoic;
	}

	public void setEicosenoic(double eicosenoic) {
		this.eicosenoic = eicosenoic;
	}

	public double getErucic() {
		return erucic;
	}

	public void setErucic(double erucic) {
		this.erucic = erucic;
	}

	public double getNervonic() {
		return nervonic;
	}

	public void setNervonic(double nervonic) {
		this.nervonic = nervonic;
	}

	public double getLinoleic() {
		return linoleic;
	}

	public void setLinoleic(double linoleic) {
		this.linoleic = linoleic;
	}

	public double getEicosadienoic() {
		return eicosadienoic;
	}

	public void setEicosadienoic(double eicosadienoic) {
		this.eicosadienoic = eicosadienoic;
	}

	public double getDocosadienoic() {
		return docosadienoic;
	}

	public void setDocosadienoic(double docosadienoic) {
		this.docosadienoic = docosadienoic;
	}

	public double getLinolenicAlpha() {
		return linolenicAlpha;
	}

	public void setLinolenicAlpha(double linolenicAlpha) {
		this.linolenicAlpha = linolenicAlpha;
	}

	public double getEicosaTrienoic() {
		return eicosaTrienoic;
	}

	public void setEicosaTrienoic(double eicosaTrienoic) {
		this.eicosaTrienoic = eicosaTrienoic;
	}

	public double getArachiDonic() {
		return arachiDonic;
	}

	public void setArachiDonic(double arachiDonic) {
		this.arachiDonic = arachiDonic;
	}

	public double getEicosaPentaenoic() {
		return eicosaPentaenoic;
	}

	public void setEicosaPentaenoic(double eicosaPentaenoic) {
		this.eicosaPentaenoic = eicosaPentaenoic;
	}

	public double getDocosaPentaenoic() {
		return docosaPentaenoic;
	}

	public void setDocosaPentaenoic(double docosaPentaenoic) {
		this.docosaPentaenoic = docosaPentaenoic;
	}

	public double getDocosaHexaenoic() {
		return docosaHexaenoic;
	}

	public void setDocosaHexaenoic(double docosaHexaenoic) {
		this.docosaHexaenoic = docosaHexaenoic;
	}

	public double getTotalSaturatedFattyAcids() {
		return totalSaturatedFattyAcids;
	}

	public void setTotalSaturatedFattyAcids(double totalSaturatedFattyAcids) {
		this.totalSaturatedFattyAcids = totalSaturatedFattyAcids;
	}

	public double getTotalMonoUnsaturatedFattyAcids() {
		return totalMonoUnsaturatedFattyAcids;
	}

	public void setTotalMonoUnsaturatedFattyAcids(double totalMonoUnsaturatedFattyAcids) {
		this.totalMonoUnsaturatedFattyAcids = totalMonoUnsaturatedFattyAcids;
	}

	public double getTotalPolyUnsaturatedFattyAcids() {
		return totalPolyUnsaturatedFattyAcids;
	}

	public void setTotalPolyUnsaturatedFattyAcids(double totalPolyUnsaturatedFattyAcids) {
		this.totalPolyUnsaturatedFattyAcids = totalPolyUnsaturatedFattyAcids;
	}

	public double getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(double cholesterol) {
		this.cholesterol = cholesterol;
	}

	public double getHistiDine() {
		return histiDine;
	}

	public void setHistiDine(double histiDine) {
		this.histiDine = histiDine;
	}

	public double getIsoleucine() {
		return isoleucine;
	}

	public void setIsoleucine(double isoleucine) {
		this.isoleucine = isoleucine;
	}

	public double getLuecine() {
		return luecine;
	}

	public void setLuecine(double luecine) {
		this.luecine = luecine;
	}

	public double getLysine() {
		return lysine;
	}

	public void setLysine(double lysine) {
		this.lysine = lysine;
	}

	public double getMethoIonine() {
		return methoIonine;
	}

	public void setMethoIonine(double methoIonine) {
		this.methoIonine = methoIonine;
	}

	public double getCyStine() {
		return cyStine;
	}

	public void setCyStine(double cyStine) {
		this.cyStine = cyStine;
	}

	public double getPhenyLalanine() {
		return phenyLalanine;
	}

	public void setPhenyLalanine(double phenyLalanine) {
		this.phenyLalanine = phenyLalanine;
	}

	public double getThreoNine() {
		return threoNine;
	}

	public void setThreoNine(double threoNine) {
		this.threoNine = threoNine;
	}

	public double getTryptoPhan() {
		return tryptoPhan;
	}

	public void setTryptoPhan(double tryptoPhan) {
		this.tryptoPhan = tryptoPhan;
	}

	public double getVaLine() {
		return vaLine;
	}

	public void setVaLine(double vaLine) {
		this.vaLine = vaLine;
	}

	public double getAlaNine() {
		return alaNine;
	}

	public void setAlaNine(double alaNine) {
		this.alaNine = alaNine;
	}

	public double getArgiNine() {
		return argiNine;
	}

	public void setArgiNine(double argiNine) {
		this.argiNine = argiNine;
	}

	public double getAsparticAcid() {
		return asparticAcid;
	}

	public void setAsparticAcid(double asparticAcid) {
		this.asparticAcid = asparticAcid;
	}

	public double getGlutamic_Acid() {
		return glutamic_Acid;
	}

	public void setGlutamic_Acid(double glutamic_Acid) {
		this.glutamic_Acid = glutamic_Acid;
	}

	public double getGlycine() {
		return glycine;
	}

	public void setGlycine(double glycine) {
		this.glycine = glycine;
	}

	public double getProLine() {
		return proLine;
	}

	public void setProLine(double proLine) {
		this.proLine = proLine;
	}

	public double getSerine() {
		return serine;
	}

	public void setSerine(double serine) {
		this.serine = serine;
	}

	public double getTyrosine() {
		return tyrosine;
	}

	public void setTyrosine(double tyrosine) {
		this.tyrosine = tyrosine;
	}

	public double getTotalOxalate() {
		return totalOxalate;
	}

	public void setTotalOxalate(double totalOxalate) {
		this.totalOxalate = totalOxalate;
	}

	public double getSolubleOxalate() {
		return solubleOxalate;
	}

	public void setSolubleOxalate(double solubleOxalate) {
		this.solubleOxalate = solubleOxalate;
	}

	public double getInsolubleOxalate() {
		return insolubleOxalate;
	}

	public void setInsolubleOxalate(double insolubleOxalate) {
		this.insolubleOxalate = insolubleOxalate;
	}

	public double getCisAconiticAcid() {
		return cisAconiticAcid;
	}

	public void setCisAconiticAcid(double cisAconiticAcid) {
		this.cisAconiticAcid = cisAconiticAcid;
	}

	public double getCitricAcid() {
		return citricAcid;
	}

	public void setCitricAcid(double citricAcid) {
		this.citricAcid = citricAcid;
	}

	public double getFumaricAcid() {
		return fumaricAcid;
	}

	public void setFumaricAcid(double fumaricAcid) {
		this.fumaricAcid = fumaricAcid;
	}

	public double getMallicAcid() {
		return mallicAcid;
	}

	public void setMallicAcid(double mallicAcid) {
		this.mallicAcid = mallicAcid;
	}

	public double getQuinicAcid() {
		return quinicAcid;
	}

	public void setQuinicAcid(double quinicAcid) {
		this.quinicAcid = quinicAcid;
	}

	public double getSuccinicAcid() {
		return succinicAcid;
	}

	public void setSuccinicAcid(double succinicAcid) {
		this.succinicAcid = succinicAcid;
	}

	public double getTartaricAcid() {
		return tartaricAcid;
	}

	public void setTartaricAcid(double tartaricAcid) {
		this.tartaricAcid = tartaricAcid;
	}

	public double getDihydroxyBenzoicAcid() {
		return dihydroxyBenzoicAcid;
	}

	public void setDihydroxyBenzoicAcid(double dihydroxyBenzoicAcid) {
		this.dihydroxyBenzoicAcid = dihydroxyBenzoicAcid;
	}

	public double getHydroxyBenzaldehyde() {
		return hydroxyBenzaldehyde;
	}

	public void setHydroxyBenzaldehyde(double hydroxyBenzaldehyde) {
		this.hydroxyBenzaldehyde = hydroxyBenzaldehyde;
	}

	public double getProtocatechuicAcid() {
		return protocatechuicAcid;
	}

	public void setProtocatechuicAcid(double protocatechuicAcid) {
		this.protocatechuicAcid = protocatechuicAcid;
	}

	public double getVanillicAcid() {
		return vanillicAcid;
	}

	public void setVanillicAcid(double vanillicAcid) {
		this.vanillicAcid = vanillicAcid;
	}

	public double getGallicAcid() {
		return gallicAcid;
	}

	public void setGallicAcid(double gallicAcid) {
		this.gallicAcid = gallicAcid;
	}

	public double getCinnamicAcid() {
		return cinnamicAcid;
	}

	public void setCinnamicAcid(double cinnamicAcid) {
		this.cinnamicAcid = cinnamicAcid;
	}

	public double getCoumaricAcidO() {
		return coumaricAcidO;
	}

	public void setCoumaricAcidO(double coumaricAcidO) {
		this.coumaricAcidO = coumaricAcidO;
	}

	public double getCoumaricAcidP() {
		return coumaricAcidP;
	}

	public void setCoumaricAcidP(double coumaricAcidP) {
		this.coumaricAcidP = coumaricAcidP;
	}

	public double getCaffeicAcid() {
		return caffeicAcid;
	}

	public void setCaffeicAcid(double caffeicAcid) {
		this.caffeicAcid = caffeicAcid;
	}

	public double getChlorogenicAcid() {
		return chlorogenicAcid;
	}

	public void setChlorogenicAcid(double chlorogenicAcid) {
		this.chlorogenicAcid = chlorogenicAcid;
	}

	public double getFerulicAcid() {
		return ferulicAcid;
	}

	public void setFerulicAcid(double ferulicAcid) {
		this.ferulicAcid = ferulicAcid;
	}

	public double getApigenin() {
		return apigenin;
	}

	public void setApigenin(double apigenin) {
		this.apigenin = apigenin;
	}

	public double getApigenin6cGlucoside() {
		return apigenin6cGlucoside;
	}

	public void setApigenin6cGlucoside(double apigenin6cGlucoside) {
		this.apigenin6cGlucoside = apigenin6cGlucoside;
	}

	public double getApigenin7oNeohesperidoside() {
		return apigenin7oNeohesperidoside;
	}

	public void setApigenin7oNeohesperidoside(double apigenin7oNeohesperidoside) {
		this.apigenin7oNeohesperidoside = apigenin7oNeohesperidoside;
	}

	public double getLuteOlin() {
		return luteOlin;
	}

	public void setLuteOlin(double luteOlin) {
		this.luteOlin = luteOlin;
	}

	public double getKaempFerol() {
		return kaempFerol;
	}

	public void setKaempFerol(double kaempFerol) {
		this.kaempFerol = kaempFerol;
	}

	public double getQuerCetin() {
		return querCetin;
	}

	public void setQuerCetin(double querCetin) {
		this.querCetin = querCetin;
	}

	public double getQuercetin3dGlucoside() {
		return quercetin3dGlucoside;
	}

	public void setQuercetin3dGlucoside(double quercetin3dGlucoside) {
		this.quercetin3dGlucoside = quercetin3dGlucoside;
	}

	public double getQuercetin3oRutinoside() {
		return quercetin3oRutinoside;
	}

	public void setQuercetin3oRutinoside(double quercetin3oRutinoside) {
		this.quercetin3oRutinoside = quercetin3oRutinoside;
	}

	public double getQuercetin3Galactoside() {
		return quercetin3Galactoside;
	}

	public void setQuercetin3Galactoside(double quercetin3Galactoside) {
		this.quercetin3Galactoside = quercetin3Galactoside;
	}

	public double getIsorHamnetin() {
		return isorHamnetin;
	}

	public void setIsorHamnetin(double isorHamnetin) {
		this.isorHamnetin = isorHamnetin;
	}

	public double getMyriCetin() {
		return myriCetin;
	}

	public void setMyriCetin(double myriCetin) {
		this.myriCetin = myriCetin;
	}

	public double getResveRatrol() {
		return resveRatrol;
	}

	public void setResveRatrol(double resveRatrol) {
		this.resveRatrol = resveRatrol;
	}

	public double getHesPeretin() {
		return hesPeretin;
	}

	public void setHesPeretin(double hesPeretin) {
		this.hesPeretin = hesPeretin;
	}

	public double getNarinGenin() {
		return narinGenin;
	}

	public void setNarinGenin(double narinGenin) {
		this.narinGenin = narinGenin;
	}

	public double getHesPeredin() {
		return hesPeredin;
	}

	public void setHesPeredin(double hesPeredin) {
		this.hesPeredin = hesPeredin;
	}

	public double getDaidZein() {
		return daidZein;
	}

	public void setDaidZein(double daidZein) {
		this.daidZein = daidZein;
	}

	public double getGeniStein() {
		return geniStein;
	}

	public void setGeniStein(double geniStein) {
		this.geniStein = geniStein;
	}

	public double getEpicaTechin() {
		return epicaTechin;
	}

	public void setEpicaTechin(double epicaTechin) {
		this.epicaTechin = epicaTechin;
	}

	public double getEpigalloCatechin() {
		return epigalloCatechin;
	}

	public void setEpigalloCatechin(double epigalloCatechin) {
		this.epigalloCatechin = epigalloCatechin;
	}

	public double getEpigalloCatechin3Gallate() {
		return epigalloCatechin3Gallate;
	}

	public void setEpigalloCatechin3Gallate(double epigalloCatechin3Gallate) {
		this.epigalloCatechin3Gallate = epigalloCatechin3Gallate;
	}

	public double getCatechin() {
		return catechin;
	}

	public void setCatechin(double catechin) {
		this.catechin = catechin;
	}

	public double getGallocatechinGallate() {
		return gallocatechinGallate;
	}

	public void setGallocatechinGallate(double gallocatechinGallate) {
		this.gallocatechinGallate = gallocatechinGallate;
	}

	public double getGalloCatechin() {
		return galloCatechin;
	}

	public void setGalloCatechin(double galloCatechin) {
		this.galloCatechin = galloCatechin;
	}

	public double getSyringicAcid() {
		return syringicAcid;
	}

	public void setSyringicAcid(double syringicAcid) {
		this.syringicAcid = syringicAcid;
	}

	public double getSinapinicAcid() {
		return sinapinicAcid;
	}

	public void setSinapinicAcid(double sinapinicAcid) {
		this.sinapinicAcid = sinapinicAcid;
	}

	public double getEllagicAcid() {
		return ellagicAcid;
	}

	public void setEllagicAcid(double ellagicAcid) {
		this.ellagicAcid = ellagicAcid;
	}

	public double getTotalPolyphenols() {
		return totalPolyphenols;
	}

	public void setTotalPolyphenols(double totalPolyphenols) {
		this.totalPolyphenols = totalPolyphenols;
	}

	public double getOligosaccharidesRaffinose() {
		return oligosaccharidesRaffinose;
	}

	public void setOligosaccharidesRaffinose(double oligosaccharidesRaffinose) {
		this.oligosaccharidesRaffinose = oligosaccharidesRaffinose;
	}

	public double getOligosaccharidesStachyose() {
		return oligosaccharidesStachyose;
	}

	public void setOligosaccharidesStachyose(double oligosaccharidesStachyose) {
		this.oligosaccharidesStachyose = oligosaccharidesStachyose;
	}

	public double getOligosaccharidesVerbascose() {
		return oligosaccharidesVerbascose;
	}

	public void setOligosaccharidesVerbascose(double oligosaccharidesVerbascose) {
		this.oligosaccharidesVerbascose = oligosaccharidesVerbascose;
	}

	public double getOligosaccharidesAjugose() {
		return oligosaccharidesAjugose;
	}

	public void setOligosaccharidesAjugose(double oligosaccharidesAjugose) {
		this.oligosaccharidesAjugose = oligosaccharidesAjugose;
	}

	public double getPhytosterolsCampesterol() {
		return phytosterolsCampesterol;
	}

	public void setPhytosterolsCampesterol(double phytosterolsCampesterol) {
		this.phytosterolsCampesterol = phytosterolsCampesterol;
	}

	public double getPhytosterolsStigmasterol() {
		return phytosterolsStigmasterol;
	}

	public void setPhytosterolsStigmasterol(double phytosterolsStigmasterol) {
		this.phytosterolsStigmasterol = phytosterolsStigmasterol;
	}

	public double getPhytosterolsSitosterol() {
		return phytosterolsSitosterol;
	}

	public void setPhytosterolsSitosterol(double phytosterolsSitosterol) {
		this.phytosterolsSitosterol = phytosterolsSitosterol;
	}

	public double getPhytate() {
		return phytate;
	}

	public void setPhytate(double phytate) {
		this.phytate = phytate;
	}

	public double getTotalSaponin() {
		return totalSaponin;
	}

	public void setTotalSaponin(double totalSaponin) {
		this.totalSaponin = totalSaponin;
	}

	public double getButyric() {
		return butyric;
	}

	public void setButyric(double butyric) {
		this.butyric = butyric;
	}

	public double getCaproic() {
		return caproic;
	}

	public void setCaproic(double caproic) {
		this.caproic = caproic;
	}

	public double getCaprylic() {
		return caprylic;
	}

	public void setCaprylic(double caprylic) {
		this.caprylic = caprylic;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}