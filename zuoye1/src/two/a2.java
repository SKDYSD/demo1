package two;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		int xz;
		boolean y;
		System.out.println("请选择需要的服务:    1.查看星座运势      2.查询星座       0.退出");
		Scanner sc=new Scanner(System.in);
		while (y=true) {
			
			xz=sc.nextInt();
			if(xz==0) {
				break;
			}
			switch (xz) {
			case 1:
				xinzuoyunshi();
				System.out.println("请选择需要的服务:    1.查看星座运势      2.查询星座       0.退出");
				break;
			case 2:
				xinzuochaxun();
				System.out.println("请选择需要的服务:    1.查看星座运势      2.查询星座       0.退出");
				break;
			default:
				System.out.println("错误，请重新选择:    1.查看星座运势      2.查询星座       0.退出");
				break;
			}
		}
	}

	public static void xinzuoyunshi() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("当前时间为:"+df.format(new Date()));
		System.out.println("本日星座运势:");
		yunshi();
	}
	
	public static void xinzuochaxun() {
		int year;
		int month;
		int day;
		System.out.println("请输入您的出生年份:");
		Scanner sy=new Scanner(System.in);
		year=sy.nextInt();
		System.out.println("请输入您的出生月份:");
		Scanner sm=new Scanner(System.in);
		month=sm.nextInt();
		System.out.println("请输入您的出生日期:");
		Scanner sd=new Scanner(System.in);
		day=sd.nextInt();
		zodiac_select(month,day);
	}
	
	public static int day_select() {
		int D;
		String a;
		SimpleDateFormat dm = new SimpleDateFormat("MM");
		a=dm.format(new Date());
		D=Integer.parseInt(a);
		return D;
	}
	
	public static int month_select() {
		int M;
		String a;
		SimpleDateFormat dd = new SimpleDateFormat("dd");
		a=dd.format(new Date());
		M=Integer.parseInt(a);
		return M;
	}
	
	public static int year_select() {
		int Y;
		String a;
		SimpleDateFormat dm = new SimpleDateFormat("MM");
		a=dm.format(new Date());
		Y=Integer.parseInt(a);
		return Y;
	}
	
	public static void zodiac_select(int month,int day) {
		if (month==1) {
			if (day>=20&&day<=31) {
				System.out.println("您是水瓶座!");
			}
			else {
				System.out.println("您是摩羯座!");
			}
		}
		if (month==2) {
			if (day>=19&&day<=30) {
				System.out.println("您是双鱼座!");
			}
			else {
				System.out.println("您是水瓶座!");
			}
	    }
		if (month==3) {
			if (day>=1&&day<=20) {
				System.out.println("您是双鱼座!");
			}
			else {
				System.out.println("您是白羊座!");
			}
	    }
		if (month==4) {
			if (day>=11&&day<=19) {
				System.out.println("您是白羊座!");
			}
			else {
				System.out.println("您是金牛座!");
			}
	    }
		if (month==5) {
			if (day>=21&&day<=31) {
				System.out.println("您是双子座!");
			}
			else {
				System.out.println("您是金牛座!");
			}
	    }
		if (month==6) {
			if (day>=22&&day<=30) {
				System.out.println("您是巨蟹座!");
			}
			else {
				System.out.println("您是双子座!");
			}
	    }
		if (month==7) {
			if (day>=23&&day<=31) {
				System.out.println("您是狮子座!");
			}
			else {
				System.out.println("您是巨蟹座!");
			}
	    }
		if (month==8) {
			if (day>=23&&day<=30) {
				System.out.println("您是处女座!");
			}
			else {
				System.out.println("您是狮子座!");
			}
	    }
		if (month==9) {
			if (day>=23&&day<=30) {
				System.out.println("您是天枰座!");
			}
			else {
				System.out.println("您是处女座!");
			}
	    }
		if (month==10) {
			if (day>=24&&day<=31) {
				System.out.println("您是天蝎座!");
			}
			else {
				System.out.println("您是天枰座!");
			}
	    }
		if (month==11) {
			if (day>=23&&day<=30) {
				System.out.println("您是射手座!");
			}
			else {
				System.out.println("您是天蝎座!");
			}
	    }
		if (month==12) {
			if (day>=22&&day<=31) {
				System.out.println("您是摩羯座!");
			}
			else {
				System.out.println("您是射手座!");
			}
	    }
	}

	public static void yunshi() {
		int D;
		Random ra =new Random();
		D=ra.nextInt(7)+1;
		switch (D) {
		case 1:
			System.out.println("白羊座:");
			System.out.println("幸运颜色：白色");
			System.out.println("幸运数字：3");
			System.out.println("契合星座：射手座");
			System.out.println("幸运物品：石榴石");
			System.out.println("今日心情：易燃易爆炸");
			System.out.println("金牛座:");
			System.out.println("幸运颜色：棕色");
			System.out.println("幸运数字：6");
			System.out.println("契合星座：双子座");
			System.out.println("幸运物品：托帕石");
			System.out.println("今日心情：细雨朦胧");
			System.out.println("双子座:");
			System.out.println("幸运颜色：咖啡色");
			System.out.println("幸运数字：4");
			System.out.println("契合星座：天秤座");
			System.out.println("幸运物品：摩根石 ");
			System.out.println("今日心情：挥汗如雨");
			System.out.println("巨蟹座:");
			System.out.println("幸运颜色：青色");
			System.out.println("幸运数字：7");
			System.out.println("契合星座：白羊座");
			System.out.println("幸运物品：橄榄石");
			System.out.println("今日心情：雨纷纷");
			System.out.println("狮子座:");
			System.out.println("幸运颜色：白色");
			System.out.println("幸运数字：1");
			System.out.println("契合星座：双子座");
			System.out.println("幸运物品：黑尖晶");
			System.out.println("今日心情：艳阳高照");
			System.out.println("处女座:");
			System.out.println("幸运颜色：黑色");
			System.out.println("幸运数字：8");
			System.out.println("契合星座：双鱼座");
			System.out.println("幸运物品：蓝玛瑙");
			System.out.println("今日心情：乌云翻滚");
			System.out.println("天秤座:");
			System.out.println("幸运颜色：紫色");
			System.out.println("幸运数字：4");
			System.out.println("契合星座：摩羯座");
			System.out.println("幸运物品：和田玉");
			System.out.println("今日心情：偶阵雨");
			System.out.println("天蝎座:");
			System.out.println("幸运颜色：咖啡色");
			System.out.println("幸运数字：3");
			System.out.println("契合星座：金牛座");
			System.out.println("幸运物品：石榴石");
			System.out.println("今日心情：遮天蔽日");
			System.out.println("射手座:");
			System.out.println("幸运颜色：银色");
			System.out.println("幸运数字：8");
			System.out.println("契合星座：射手座");
			System.out.println("幸运物品：蓝碧玺");
			System.out.println("今日心情：电闪雷鸣");
			System.out.println("摩羯座:");
			System.out.println("幸运颜色：米色");
			System.out.println("幸运数字：9");
			System.out.println("契合星座：天蝎座");
			System.out.println("幸运物品：奶白晶");
			System.out.println("今日心情：透心凉");
			System.out.println("水瓶座:");
			System.out.println("幸运颜色：棕色");
			System.out.println("幸运数字：4");
			System.out.println("契合星座：天秤座");
			System.out.println("幸运物品：琥珀");
			System.out.println("今日心情：日月无光");
			System.out.println("双鱼座:");
			System.out.println("幸运颜色：红色");
			System.out.println("幸运数字：1");
			System.out.println("契合星座：摩羯座");
			System.out.println("幸运物品：绿松石");
			System.out.println("今日心情：拨云见日");
			break;
		case 2:
			System.out.println("白羊座:");
			System.out.println("幸运颜色：蓝色");
			System.out.println("幸运数字：1");
			System.out.println("契合星座：双子座");
			System.out.println("幸运物品：红碧玺");
			System.out.println("今日心情：蓝天白云");
			System.out.println("金牛座:");
			System.out.println("幸运颜色：金色");
			System.out.println("幸运数字：9");
			System.out.println("契合星座：天秤座");
			System.out.println("幸运物品：灰月光");
			System.out.println("今日心情：万里无云");
			System.out.println("双子座:");
			System.out.println("幸运颜色：银色");
			System.out.println("幸运数字：0");
			System.out.println("契合星座：双鱼座");
			System.out.println("幸运物品：蓝碧玺");
			System.out.println("今日心情：大雨将至");
			System.out.println("巨蟹座:");
			System.out.println("幸运颜色：白色");
			System.out.println("幸运数字：4");
			System.out.println("契合星座：摩羯座");
			System.out.println("幸运物品：葡萄石");
			System.out.println("今日心情：飞来横祸");
			System.out.println("狮子座:");
			System.out.println("幸运颜色：橘色");
			System.out.println("幸运数字：0");
			System.out.println("契合星座：射手座");
			System.out.println("幸运物品：绿松石");
			System.out.println("今日心情：艳阳高照");
			System.out.println("处女座:");
			System.out.println("幸运颜色：金色");
			System.out.println("幸运数字：5");
			System.out.println("契合星座：狮子座");
			System.out.println("幸运物品：红碧玺");
			System.out.println("今日心情：雷雨交加");
			System.out.println("天秤座:");
			System.out.println("幸运颜色：银色");
			System.out.println("幸运数字：2");
			System.out.println("契合星座：水瓶座");
			System.out.println("幸运物品：黄水晶");
			System.out.println("今日心情：风轻日暖");
			System.out.println("天蝎座:");
			System.out.println("幸运颜色：白色");
			System.out.println("幸运数字：3");
			System.out.println("契合星座：天秤座");
			System.out.println("幸运物品：葡萄石");
			System.out.println("今日心情：小凉爽");
			System.out.println("射手座:");
			System.out.println("幸运颜色：橘色");
			System.out.println("幸运数字：7");
			System.out.println("契合星座：摩羯座");
			System.out.println("幸运物品：蓝碧玺");
			System.out.println("今日心情：海天云蒸");
			System.out.println("摩羯座:");
			System.out.println("幸运颜色：蓝色");
			System.out.println("幸运数字：9");
			System.out.println("契合星座：金牛座");
			System.out.println("幸运物品：多彩玉晶");
			System.out.println("今日心情：晴空万里");
			System.out.println("水瓶座:");
			System.out.println("幸运颜色：咖啡色");
			System.out.println("幸运数字：6");
			System.out.println("契合星座：双鱼座");
			System.out.println("幸运物品：海蓝宝");
			System.out.println("今日心情：风驰电掣");
			System.out.println("双鱼座:");
			System.out.println("幸运颜色：黄色");
			System.out.println("幸运数字：8");
			System.out.println("契合星座：双子座");
			System.out.println("幸运物品：摩根石");
			System.out.println("今日心情：拳头大的冰雹");
			break;
		case 3:
			System.out.println("白羊座:");
			System.out.println("幸运颜色：橘色");
			System.out.println("幸运数字：8");
			System.out.println("契合星座：天蝎座");
			System.out.println("幸运物品：拉利玛");
			System.out.println("今日心情：万里无云");
			System.out.println("金牛座:");
			System.out.println("幸运颜色：紫色");
			System.out.println("幸运数字：3");
			System.out.println("契合星座：射手座");
			System.out.println("幸运物品：坦桑石");
			System.out.println("今日心情：雷雨交加");
			System.out.println("双子座:");
			System.out.println("幸运颜色：白色");
			System.out.println("幸运数字：6");
			System.out.println("契合星座：处女座");
			System.out.println("幸运物品：葡萄石");
			System.out.println("今日心情：龙卷风");
			System.out.println("巨蟹座:");
			System.out.println("幸运颜色：咖啡色");
			System.out.println("幸运数字：4");
			System.out.println("契合星座：摩羯座");
			System.out.println("幸运物品：托帕石");
			System.out.println("今日心情：和风细雨");
			System.out.println("狮子座:");
			System.out.println("幸运颜色：蓝色");
			System.out.println("幸运数字：1");
			System.out.println("契合星座：双子座");
			System.out.println("幸运物品：和田玉");
			System.out.println("今日心情：乌云一朵朵");
			System.out.println("处女座:");
			System.out.println("幸运颜色：咖啡色");
			System.out.println("幸运数字：3");
			System.out.println("契合星座：天秤座");
			System.out.println("幸运物品：蓝宝石");
			System.out.println("今日心情：阴转多云");
			System.out.println("天秤座:");
			System.out.println("幸运颜色：金色c");
			System.out.println("幸运数字：7");
			System.out.println("契合星座：双鱼座");
			System.out.println("幸运物品：银饰");
			System.out.println("今日心情：毛毛雨");
			System.out.println("天蝎座:");
			System.out.println("幸运颜色：银色");
			System.out.println("幸运数字：5");
			System.out.println("契合星座：狮子座");
			System.out.println("幸运物品：奶白晶");
			System.out.println("今日心情：久旱逢甘霖");
			System.out.println("射手座:");
			System.out.println("幸运颜色：黄色");
			System.out.println("幸运数字：9");
			System.out.println("契合星座：处女座");
			System.out.println("幸运物品：蓝砂石");
			System.out.println("今日心情：暖风");
			System.out.println("摩羯座:");
			System.out.println("幸运颜色：黑色");
			System.out.println("幸运数字：6");
			System.out.println("契合星座：射手座");
			System.out.println("幸运物品：橄榄石");
			System.out.println("今日心情：看海");
			System.out.println("水瓶座:");
			System.out.println("幸运颜色：绿色");
			System.out.println("幸运数字：3");
			System.out.println("契合星座：双鱼座");
			System.out.println("幸运物品：沉香");
			System.out.println("今日心情：风轻云淡");
			System.out.println("双鱼座:");
			System.out.println("幸运颜色：白色");
			System.out.println("幸运数字：1");
			System.out.println("契合星座：摩羯座");
			System.out.println("幸运物品：玉盘玛瑙");
			System.out.println("今日心情：小凉爽");
			break;
		case 4:
			System.out.println("白羊座:");
			System.out.println("幸运颜色：金色");
			System.out.println("幸运数字：7");
			System.out.println("契合星座：巨蟹座");
			System.out.println("幸运物品：海蓝宝");
			System.out.println("金牛座:");
			System.out.println("幸运颜色：金色c");
			System.out.println("幸运数字：3");
			System.out.println("契合星座：狮子座");
			System.out.println("幸运物品：沉香");
			System.out.println("双子座:");
			System.out.println("幸运颜色：蓝色");
			System.out.println("幸运数字：2");
			System.out.println("契合星座：金牛座");
			System.out.println("幸运物品：摩根石");
			System.out.println("巨蟹座:");
			System.out.println("幸运颜色：绿色");
			System.out.println("幸运数字：9");
			System.out.println("契合星座：双鱼座");
			System.out.println("幸运物品：祖母绿");
			System.out.println("狮子座:");
			System.out.println("幸运颜色：红色");
			System.out.println("幸运数字：2");
			System.out.println("契合星座：金牛座");
			System.out.println("幸运物品：多彩玉晶");
			System.out.println("处女座:");
			System.out.println("幸运颜色：金色");
			System.out.println("幸运数字：9");
			System.out.println("契合星座：狮子座");
			System.out.println("幸运物品：石榴石");
			System.out.println("天秤座:");
			System.out.println("幸运颜色：白色");
			System.out.println("幸运数字：8");
			System.out.println("契合星座：金牛座");
			System.out.println("幸运物品：橄榄石");
			System.out.println("天蝎座:");
			System.out.println("幸运颜色：绿色");
			System.out.println("幸运数字：6");
			System.out.println("契合星座：狮子座");
			System.out.println("幸运物品：翡翠");
			System.out.println("射手座:");
			System.out.println("幸运颜色：青色");
			System.out.println("幸运数字：6");
			System.out.println("契合星座：水瓶座");
			System.out.println("幸运物品：珍珠");
			System.out.println("摩羯座:");
			System.out.println("幸运颜色：橘色");
			System.out.println("幸运数字：7");
			System.out.println("契合星座：双鱼座");
			System.out.println("幸运物品：天河石");
			System.out.println("水瓶座:");
			System.out.println("幸运颜色：白色");
			System.out.println("幸运数字：8");
			System.out.println("契合星座：金牛座");
			System.out.println("幸运物品：猫眼石");
			System.out.println("双鱼座:");
			System.out.println("幸运颜色：红色");
			System.out.println("幸运数字：8");
			System.out.println("契合星座：射手座");
			System.out.println("幸运物品：猫眼石 ");
			break;
		case 5:
			System.out.println("白羊座:");
			System.out.println("幸运颜色：咖啡色");
			System.out.println("幸运数字：0");
			System.out.println("契合星座：金牛座");
			System.out.println("幸运物品：灰月光");
			System.out.println("今日心情：人暖风和");
			System.out.println("金牛座:");
			System.out.println("幸运颜色：灰色");
			System.out.println("幸运数字：5");
			System.out.println("契合星座：双鱼座");
			System.out.println("幸运物品：玉盘玛瑙");
			System.out.println("今日心情：扬沙打脸");
			System.out.println("双子座:");
			System.out.println("幸运颜色：橘色");
			System.out.println("幸运数字：1");
			System.out.println("契合星座：双子座");
			System.out.println("幸运物品：奶白晶");
			System.out.println("今日心情：太阳雨");
			System.out.println("巨蟹座:");
			System.out.println("幸运颜色：白色");
			System.out.println("幸运数字：1");
			System.out.println("契合星座：摩羯座");
			System.out.println("幸运物品：紫水晶");
			System.out.println("今日心情：微风拂面");
			System.out.println("狮子座:");
			System.out.println("幸运颜色：绿色");
			System.out.println("幸运数字：3");
			System.out.println("契合星座：天蝎座");
			System.out.println("幸运物品：奶白晶");
			System.out.println("今日心情：暖风");
			System.out.println("处女座:");
			System.out.println("幸运颜色：红色");
			System.out.println("幸运数字：7");
			System.out.println("契合星座：天秤座");
			System.out.println("幸运物品：莫桑钻");
			System.out.println("今日心情：雾里看花");
			System.out.println("天秤座:");
			System.out.println("幸运颜色：白色");
			System.out.println("幸运数字：7");
			System.out.println("契合星座：天蝎座");
			System.out.println("幸运物品：钻石");
			System.out.println("今日心情：润物细无声");
			System.out.println("天蝎座:");
			System.out.println("幸运颜色：粉色");
			System.out.println("幸运数字：8");
			System.out.println("契合星座：射手座");
			System.out.println("幸运物品：蛋白石");
			System.out.println("今日心情：一个人撑伞");
			System.out.println("射手座:");
			System.out.println("幸运颜色：黄色");
			System.out.println("幸运数字：4");
			System.out.println("契合星座：金牛座");
			System.out.println("幸运物品：紫水晶");
			System.out.println("今日心情：满天乌云");
			System.out.println("摩羯座:");
			System.out.println("幸运颜色：黑色");
			System.out.println("幸运数字：5");
			System.out.println("契合星座：摩羯座");
			System.out.println("幸运物品：海蓝宝");
			System.out.println("今日心情：风轻日暖");
			System.out.println("水瓶座:");
			System.out.println("幸运颜色：蓝色");
			System.out.println("幸运数字：5");
			System.out.println("契合星座：水瓶座");
			System.out.println("幸运物品：黄水晶");
			System.out.println("今日心情：雷声大雨点小");
			System.out.println("双鱼座:");
			System.out.println("幸运颜色：灰色");
			System.out.println("幸运数字：9");
			System.out.println("契合星座：射手座");
			System.out.println("幸运物品：金发晶");
			System.out.println("今日心情：及时雨");
			break;
		case 6:
			System.out.println("白羊座:");
			System.out.println("幸运颜色：白色");
			System.out.println("幸运数字：7");
			System.out.println("契合星座：天蝎座");
			System.out.println("幸运物品：太阳石");
			System.out.println("今日心情：电闪雷鸣");
			System.out.println("金牛座:");
			System.out.println("幸运颜色：蓝色");
			System.out.println("幸运数字：4");
			System.out.println("契合星座：白羊座");
			System.out.println("幸运物品：芬达石");
			System.out.println("今日心情：拨云见日");
			System.out.println("双子座:");
			System.out.println("幸运颜色：橘色");
			System.out.println("幸运数字：0");
			System.out.println("契合星座：处女座");
			System.out.println("幸运物品：奶白晶");
			System.out.println("今日心情：偶阵雨");
			System.out.println("巨蟹座:");
			System.out.println("幸运颜色：黄色");
			System.out.println("幸运数字：9");
			System.out.println("契合星座：白羊座");
			System.out.println("幸运物品：蓝砂石");
			System.out.println("今日心情：雷声大雨点小");
			System.out.println("狮子座:");
			System.out.println("幸运颜色：紫色");
			System.out.println("幸运数字：7");
			System.out.println("契合星座：天蝎座");
			System.out.println("幸运物品：沉香");
			System.out.println("今日心情：毛毛雨");
			System.out.println("处女座:");
			System.out.println("幸运颜色：粉色");
			System.out.println("幸运数字：8");
			System.out.println("契合星座：金牛座");
			System.out.println("幸运物品：弟子珠");
			System.out.println("今日心情：雨纷纷");
			System.out.println("天秤座:");
			System.out.println("幸运颜色：咖啡色");
			System.out.println("幸运数字：1");
			System.out.println("契合星座：水瓶座");
			System.out.println("幸运物品：葡萄石");
			System.out.println("今日心情：忽如一夜春风来");
			System.out.println("天蝎座:");
			System.out.println("幸运颜色：黑色");
			System.out.println("幸运数字：4");
			System.out.println("契合星座：射手座");
			System.out.println("幸运物品：红宝石");
			System.out.println("今日心情：千里黄云");
			System.out.println("射手座:");
			System.out.println("幸运颜色：绿色");
			System.out.println("幸运数字：5");
			System.out.println("契合星座：双子座");
			System.out.println("幸运物品：蛋白石");
			System.out.println("今日心情：大雨将至");
			System.out.println("摩羯座:");
			System.out.println("幸运颜色：白色");
			System.out.println("幸运数字：9");
			System.out.println("契合星座：摩羯座");
			System.out.println("幸运物品：莫桑钻");
			System.out.println("今日心情：阴晴不定");
			System.out.println("水瓶座:");
			System.out.println("幸运颜色：咖啡色");
			System.out.println("幸运数字：8");
			System.out.println("契合星座：天秤座");
			System.out.println("幸运物品：蓝碧玺");
			System.out.println("今日心情：黑云压城");
			System.out.println("双鱼座:");
			System.out.println("幸运颜色：米色");
			System.out.println("幸运数字：2");
			System.out.println("契合星座：金牛座");
			System.out.println("幸运物品：拉利玛");
			System.out.println("今日心情：微风拂面");
			break;
		case 7:
			System.out.println("白羊座:");
			System.out.println("幸运颜色：绿色");
			System.out.println("幸运数字：1");
			System.out.println("契合星座：巨蟹座");
			System.out.println("幸运物品：蛋白石");
			System.out.println("今日心情：死气沉沉");
			System.out.println("金牛座:");
			System.out.println("幸运颜色：金色");
			System.out.println("幸运数字：9");
			System.out.println("契合星座：处女座");
			System.out.println("幸运物品：弟子珠");
			System.out.println("今日心情：鹅毛大雪");
			System.out.println("双子座:");
			System.out.println("幸运颜色：黄色");
			System.out.println("幸运数字：2");
			System.out.println("契合星座：狮子座");
			System.out.println("幸运物品：绿松石");
			System.out.println("今日心情：断壁残垣");
			System.out.println("巨蟹座:");
			System.out.println("幸运颜色：白色");
			System.out.println("幸运数字：3");
			System.out.println("契合星座：摩羯座");
			System.out.println("幸运物品：葡萄石");
			System.out.println("今日心情：雨纷纷");
			System.out.println("狮子座:");
			System.out.println("幸运颜色：米色");
			System.out.println("幸运数字：9");
			System.out.println("契合星座：双鱼座");
			System.out.println("幸运物品：蓝砂石");
			System.out.println("今日心情：风轻云淡");
			System.out.println("处女座:");
			System.out.println("幸运颜色：青色");
			System.out.println("幸运数字：7");
			System.out.println("契合星座：白羊座");
			System.out.println("幸运物品：拉利玛");
			System.out.println("今日心情：毛毛雨");
			System.out.println("天秤座:");
			System.out.println("幸运颜色：白色");
			System.out.println("幸运数字：4");
			System.out.println("契合星座：金牛座");
			System.out.println("幸运物品：灰月光");
			System.out.println("今日心情：心口灌冷风");
			System.out.println("天蝎座:");
			System.out.println("幸运颜色：棕色");
			System.out.println("幸运数字：7");
			System.out.println("契合星座：天秤座");
			System.out.println("幸运物品：尖晶石");
			System.out.println("今日心情：拨云见日");
			System.out.println("射手座:");
			System.out.println("幸运颜色：红色");
			System.out.println("幸运数字：6");
			System.out.println("契合星座：巨蟹座");
			System.out.println("幸运物品：紫云母");
			System.out.println("今日心情：冰雪消融");
			System.out.println("摩羯座:");
			System.out.println("幸运颜色：棕色");
			System.out.println("幸运数字：8");
			System.out.println("契合星座：双鱼座");
			System.out.println("幸运物品：天河石");
			System.out.println("今日心情：及时雨");
			System.out.println("水瓶座:");
			System.out.println("幸运颜色：黑色");
			System.out.println("幸运数字：5");
			System.out.println("契合星座：射手座");
			System.out.println("幸运物品：玉盘玛瑙");
			System.out.println("今日心情：等风来");
			System.out.println("双鱼座:");
			System.out.println("幸运颜色：粉色");
			System.out.println("幸运数字：1");
			System.out.println("契合星座：射手座");
			System.out.println("幸运物品：红碧玺");
			System.out.println("今日心情：晴空万里");
			break;
		default:
			break;
		}
	}
}