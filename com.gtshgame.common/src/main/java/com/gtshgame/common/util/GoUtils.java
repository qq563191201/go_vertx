package com.gtshgame.common.util;

import java.security.MessageDigest;
import java.util.regex.Pattern;
import java.util.Random;
import java.util.regex.Matcher;  


public final class GoUtils {
	
	public static String PERMIT_SECRET = "KM30PMoCwHaSiCzJ"; //证书密钥
	
	private static String [] title = {"丁","万","万俟","上官","东","东乡","东方","东郭","东门","严","丰","乌","乐","乔","乜","习","于","于","云","亓","井","亢","京","仇","仉","介","从","仓","令狐","仪","仰","仲","仲孙","仲长","任","伊","伍","伏","伯","何","佘","余","佟","佴","侯","俞","倪","傅","储","兀官","元","充","党","全","公","公乘","公仪","公冶","公孙","公羊","公良","公西","关","养","冀","冉","冒","农","冯","况","冷","冼","凌","凤","刁","刘","利","别","劳","勾","包","匡","华","卓","单","单于","南","南宫","南郭","南门","卜","卞","卢","卫","印","危","却","厉","厍","原","双","叔孙","古","召","史","叶","司","司城","司寇","司徒","司空","司马","吉","后","向","吕","吴","周","呼延","和","咸","哈","唐","商","喻","国","堵","墨","壤驷","夏","夏侯","夔","太叔","太史","夹谷","奚","姚","姜","姬","娄","子车","孔","孙","孟","季","宁","宇文","安","宋","宓","宗","宗正","官","宣","宦","宫","宰","宰父","家","容","宾","宿","密","寇","富","寿","封","尉迟","尔朱","尚","尤","尹","居","屈","屈突","展","屠","山","岑","岳","崔","嵇","巢","左","左丘","巨","巩","巫","巫马","巴","帅","师","席","常","干","平","年","幸","广","庄","庆","应","庞","康","庾","廉","廖","弓","弘","张","张廖","弥","强","归","彭","徐","微生","怀","恽","惠","慎","慕","慕容","戈","戎","成","戚","戴","房","房","扈","扶","抗","折","拓跋","挚","揭","支","敖","敬","文","方","施","时","昌","明","易","昝","是","晁","晋","晏","景","暨","暴","曲","曹","曾","有","木","朱","权","李","杜","杞","束","来","杨","杭","松","林","枚","柏","查","柯","柳","柴","栾","桂","桑","桓","梁","梁丘","梅","楚","楼","樊","檀","欧","欧阳","步","武","殳","段","段干","殷","毋","毋丘","毕","毛","水","汝","江","池","汤","汪","汲","沃","沈","沙","法","洪","浑","浦","海","涂","淳于","温","游","湛","溥","滑","滕","满","漆","漆雕","潘","澹台","濮","濮阳","火","焦","熊","燕","爱","牛","牟","牧","狄","狐","独孤","王","班","琴","璩","甄","甘","田","申","申屠","畅","疏","白","百里","皇","皇甫","皋","皮","益","盖","盛","相","相里","真","眭","督","瞿","石","祁","祖","祝","祭","禄","福","禹","秋","种","秘","秦","程","穆","空","窦","章","童","端","端木","竹","竺","符","第五","简","管","篁","籍","米","糜","索","綦","繁","红","纪","练","终","经","缑","缪","罗","羊","羊舌","羿","翁","翟","老","耿","聂","胡","胡母","胥","胶","能","臧","舒","舜","艾","芮","花","苌","苍","苏","苗","范","茅","茹","荀","荆","荣","莘","莫","萧","葛","董","蒋","蒙","蒯","蒲","蓝","蓟","蓬","蔚","蔡","蔺","薛","虎","虞","融","衡","袁","裘","裴","褚","西门","覃","解","言","訾","詹","计","许","诸","诸葛","谈","谢","谭","谯","谷","谷梁","贝","贡","贲","费","贺","贺兰","贾","赏","赖","赫连","赵","越","路","蹇","车","车正","轩辕","辛","辜","边","达","过","还","连","迟","逄","通","逯","邓","邝","邢","那","邬","邰","邱","邴","邵","邹","郁","郁","郇","郈","郎","郏","郑","郗","郜","郝","郦","郭","都","鄂","鄢","酆","金","钟","钟离","钦","钭","钮","钱","铁","长孙","门","闫","闵","闻","闻人","闾","闾丘","阎","阙","阚","阮","阳","阴","阿","陆","陈","陶","隆","随","隗","雍","雍门","雷","霍","靳","鞠","韦","韩","韶","项","须","顾","颛孙","颜","风","饶","马","骆","高","高","魏","鱼","鲁","鲍","鲜","鲜于","麦","麻","黄","黎","齐","龙","龚"};   
	private static String [] name = {"一凡","一南","一嘉","一瑾","一璇","一禾","一雯","丁兰","丁辰","三姗","三春","三诗","丕","世","世敏","世英","世韵","东","丝","丝娜","丝微","丝柳","丝琦","丝琪","丝祺","丝萝","丝雨","丞","丰熙","丰羽","丰茂","丰雅","丹","丹丹","丹彤","丹溪","丹红","主","丽","丽佳","丽华","丽姝","丽思","丽文","丽泽","丽玉","丽珠","丽芳","丽雅","乃心","乃欣","之桃","乐","乐人","乐和","乐咏","乐圣","乐天","乐安","乐家","乐容","乐容","乐山","乐康","乐心","乐心","乐志","乐怡","乐悦","乐悦","乐意","乐成","乐欣","乐欣","乐正","乐水","乐池","乐游","乐湛","乐然","乐生","乐章","乐童","乐语","乐贤","乐逸","乐邦","乐音","乒","书云","书仪","书意","书慧","书文","书桃","书艺","书萱","书语","云","云亭","云岚","云心","云梦","云水","云淡","云溪","云英","云蔚","云霞","云露","云韶","云飞","亚","产","亮","亿","仁","仇","今歌","今瑶","今雨","仑","仓","仕","仙仪","仙媛","仙韵","仝","仞","代","令慧","令美","以彤","以晴","以欣","以蕊","以轩","仪","仪文","仪芳","仲舒","任","任真","伊","伋","众","优乐","优悠","优悦","优扬","优瑗","会欣","会雯","伟","伟兆","伟博","伟彦","伟志","伟懋","伟才","伟晔","伟毅","伟泽","伟祺","伟茂","伟诚","伶伶","伶俐","伸","佁然","佐","余妍","余馥","作人","佩兰","佩杉","佩玉","佩珍","佳","佳妍","佳思","佳悦","佳惠","佳文","佳美","佺","侃","依","依云","依心","依楠","依波","依然","依珊","依白","依秋","依童","依美","侪","促","俊","俊人","俊侠","俊健","俊力","俊友","俊发","俊名","俊哲","俊喆","俊弼","俊彦","俊德","俊悟","俊慧","俊才","俊拔","俊捷","俊明","俊晤","俊智","俊材","俊杰","俊楚","俊楠","俊民","俊爽","俊美","俊能","俊良","俊艾","俊英","俊茂","俊誉","俊语","俊豪","俊贤","俊达","俊迈","俊远","俊逸","俊郎","俊雄","俊雅","俊雅","俊风","俊驰","俏丽","俏美","俞","俟","信","信厚","信然","信瑞","信鸥","信鸿","俣","俨雅","俪","修","修为","修伟","修平","修德","修敏","修文","修明","修杰","修永","修洁","修洁","修然","修真","修竹","修筠","修美","修能","修诚","修谨","修贤","修远","修雅","修齐","俯","候","倚云","倝","倡","倧","倩","倩丽","倩秀","倩美","倩语","倪","倰","偀","健","健柏","偲","偲偲","偿","储","僖","僧","僳","儋","儒","元亮","元凯","元勋","元化","元嘉","元基","元德","元忠","元思","元恺","元明","元正","元武","元洲","元甲","元白","元纬","元良","元英","元青","元驹","元魁","元龙","光临","光亮","光华","光启","光明","光济","光熙","光耀","光誉","光赫","光辉","光远","光霁","兰","兰娜","兰月","兰梦","兰泽","兰芝","兰芳","兰若","兰英","兰蕙","兴业","兴为","兴修","兴发","兴国","兴学","兴安","兴平","兴庆","兴德","兴怀","兴思","兴文","兴旺","兴昌","兴朝","兴生","兴腾","兴言","兴贤","兴运","兴邦","其雨","典丽","典雅","冀","冉","冉冉","冕","冠宇","冠玉","冬梅","冰","冰冰","冰彦","冰心","冰枫","冰洁","冰莹","冰蓝","冷","冽","凌春","凌晓","凌波","凌雪","凝","凝心","凝思","凝洁","凝然","凝远","凝雨","凝雪","凝静","凡","凤","凯","凯乐","凯凯","凯唱","凯复","凯安","凯定","凯康","凯捷","凯旋","凯歌","凯泽","凯风","函","列","则","刚","刚捷","刚毅","刚洁","刚豪","创","初然","初阳","利","利","前","剑","力","力勤","力夫","力学","力强","力行","力言","助","劭","劻","劼","势","勇","勇军","勇捷","勇毅","勇男","勇锐","勒","勘","勤","勰","北嘉","北晶","北辰","千叶","千秋","升荣","华","华乐","华奥","华婉","华容","华彩","华晖","华月","华楚","华池","华清","华灿","华皓","华美","华翰","华芝","华茂","华荣","华藏","华辉","华采","华采","卓","卓然","卓逸","博丽","博厚","博学","博实","博容","博延","博敏","博文","博明","博易","博涉","博涛","博瀚","博简","博艺","博裕","博赡","博超","博达","博远","博雅","博雅","卿","卿云","卿月","参","叆","友","双文","双玉","叔","古兰","古韵","古香","可","可佳","可儿","可可","可嘉","可心","叶","叶丰","叶丹","叶农","叶吉","叶嘉","叶帆","叶彤","叶春","叶欣","叶舞","叶芳","叶飞","司晨","司辰","合","合乐","合瑞","合美","吉帆","吉敏","吉星","吉月","吉欣","吉玉","吉玟","同光","同化","同和","同方","同济","同甫","名姝","吏","向文","向明","向晨","向晨","向笛","向荣","向阳","君","君丽","君昊","君洁","君浩","君雅","吟怀","含娇","含文","含景","含玉","含秀","含香","听云","听然","启颜","呤","和光","和同","和安","和宜","和平","和平","和志","和怡","和怡","和悌","和悌","和悦","和悦","和惬","和昶","和暄","和暖","和歌","和正","和泰","和泽","和洽","和煦","和煦","和玉","和玉","和璧","和璧","和畅","和硕","和美","和蔼","和裕","和豫","和豫","和通","和雅","和雅","和静","和韵","和顺","和颂","和风","咏德","咏志","咏思","咏歌","咛","咸英","品韵","哲","哲丽","哲圣","哲妍","哲彦","哲思","哲瀚","哲美","哲茂","唱月","啸","善和","善思","善芳","善静","喆","喜儿","喜悦","嗣","嘉","嘉丽","嘉云","嘉佑","嘉勋","嘉宝","嘉实","嘉容","嘉平","嘉年","嘉庆","嘉德","嘉志","嘉怡","嘉悦","嘉悦","嘉惠","嘉慕","嘉懿","嘉懿","嘉月","嘉木","嘉树","嘉歆","嘉歆","嘉泽","嘉淑","嘉澍","嘉熙","嘉玉","嘉玉","嘉珍","嘉瑞","嘉石","嘉祥","嘉祯","嘉福","嘉禧","嘉禾","嘉纳","嘉美","嘉胜","嘉致","嘉良","嘉茂","嘉荣","嘉言","嘉言","嘉誉","嘉许","嘉谊","嘉赐","嘉运","嘉音","嘉颖","嘉颖","囡","囡囡","园","国兴","国安","国源","圣杰","坚","坚壁","坚成","坚白","坚秉","坚诚","墨","士","壮","备","夏兰","夏岚","夏彤","夏月","夏璇","夏菡","夏萱","夏雪","夏青","多思","天","天佑","天元","天华","天和","天媛","天宇","天工","天干","天心","天恩","天悦","天慧","天成","天材","天欣","天泽","天瑞","天睿","天睿","天禄","天空","天籁","天纵","天罡","天翰","天蓝","天赋","天路","天逸","天音","天韵","天韵","天骄","天骄","奇伟","奇希","奇志","奇思","奇思","奇文","奇文","奇正","奇水","奇玮","奇略","奇胜","奇致","奇迈","奇逸","奇邃","奇颖","奕叶","奕奕","奥婷","奥维","奥雅","女","奴","好","好慕","好洁","如云","如仪","如冰","如心","如意","如雪","如风","如馨","妃","妆","妍","妍丽","妍和","妍妍","妍歌","妍芳","妍雅","妙","妙婧","妙思","妙意","妙晴","妙珍","妙音","妙颜","妞妞","妮娜","妮子","妶","妹","妹","姐","姑","姗","姗姗","姜","姝","姝丽","姝好","姝惠","姝美","姝艳","姞","姣","姣丽","姣妍","姣姣","姬","姮娥","姯","姲","姳","姹","姿","娅思","娅楠","娅欣","娅玟","娅童","娅芳","娅静","娆","娇","娇洁","娇然","娉","娘","娜","娜兰","娜娜","娟","娟丽","娟妍","娟娟","娟秀","娥","娴","娴婉","娴淑","娴雅","娴静","婀娜","婉","婉丽","婉仪","婉奕","婉娜","婉容","婉慧","婉柔","婉淑","婉清","婉然","婉秀","婉静","婕","婧","婵","婵娟","婷","婷婷","婷然","婷玉","婷秀","婷美","媚","媛女","媱","嫂","嫔","嫔然","嫚儿","嫣","嫣然","嫦","嫱","子","子丹","子亦","子凡","子墨","子宁","子安","子实","子帆","子平","子怀","子怡","子悦","子惠","子昂","子明","子晋","子楠","子欣","子民","子濯","子爱","子珍","子琪","子琳","子瑜","子璇","子真","子石","子童","子美","子舒","子菡","子萱","子蕙","子薇","子轩","子默","孟乐","孟夏","孟阳","季同","季萌","季雅","学义","学博","学名","学文","学林","学民","学海","学真","孺","宁","宁乐","宇寰","宇文","宇航","宇荫","宇达","守","安吉","安和","安国","安妮","安娜","安娴","安宁","安安","安宜","安平","安康","安志","安怡","安易","安晏","安歌","安民","安澜"};
	
	@SuppressWarnings("deprecation")
	public static String ToJsonStr(String s) {
		s = java.net.URLDecoder.decode(s);
		if (s.charAt(0) == '{') {
			return s;
		} else {
			StringBuilder bjs = new StringBuilder();
			String[] allvalue = s.split("&");
			bjs.append("{");
			for (int i = 0; i < allvalue.length; i++) {
				String[] kv = allvalue[i].split("=");

				bjs.append("\"").append(kv[0]).append("\"").append(":").append(kv[1]).append(",");
			}
			bjs = bjs.deleteCharAt(bjs.length() - 1);
			bjs.append("}");
			return bjs.toString();
		}
	}
	
	 private static String RANDSTRING_SRC = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

	    /**
	     * 随机字符串
	     * @param $num
	     * @param null $src
	     * @return string
	     */
	    public static String randString()
	    {
	    	
	    	String str = RANDSTRING_SRC;
	        int len = 18;
	        String res = "";

	        for (int i = 0; i < len; i++) {
	        	int ran = random(61,1);
	        	res += str.charAt(ran);
			}

	        return res;
	    }
	

	public static String string2MD5(String inStr) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return "";
		}
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];

		for (int i = 0; i < charArray.length; i++)
			byteArray[i] = (byte) charArray[i];
		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16)
				hexValue.append("0");
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();

	}
	//随机昵称
	public static String RandomNickName() {
 		int titleNum = random(590,1);
 		int nameNum = random(998,1);
 		String retName = title[titleNum] + name[nameNum];
		return retName;
	}
	
	public static int random(int max,int min) {
        Random random = new Random();

        int s = random.nextInt(max)%(max-min+1) + min;
        return s;
        
    }
	
	//校验手机号
	public static boolean isMobile(String str) {
		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
		Matcher m = p.matcher(str);
		return m.matches();
	}
	//校验邮箱号
	public static boolean isEmail(String email){
		  //正则表达式
	    Pattern p = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");  
	    Matcher m = p.matcher(email);  
	    return m.find(); 
		
//		String regex = "^[A-Za-z]{1,40}@[A-Za-z0-9]{1,40}\\.[A-Za-z]{2,3}$";
//		return email.matches(regex);
	}
}