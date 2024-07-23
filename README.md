# Experiment-SOLID
### گام ۱: افزودن یک روش سفارش و پرداخت تلفنی
	تغییراتی را که در کد فعلی برنامه می‌دهید، در جدول زیر ثبت کنید و در نهایت تعداد کل تغییرات را اعلان کنید.
    - توجه: مواردی که به عنوان تغییرات باید اعلان شود شامل این موارد هستند:
      1. ساخت کلاس جدید
      2. افزودن تابع جدید به کلاس و یا واسط (برای توابع جدید صرفا اعلام تغییر کنید)
      3. هر خطوط پیاپی‌ای که در تابع main و برای افزودن یک قابلیت جدید اضافه می‌کنید. به عنوان مثال اگر سه خط را به منظور تشخیص نوع پیام اضافه می‌کنید، آن سه خط را در قالب یک تغییر اعلام کنید (البته جزییات آن را در ستون «شرحی کوتاه از تغییر» توضیح دهید).

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>OrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderPayment</p>
</td>
</tr>

</tr>
<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>OrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderRegister</p>
</td>
</tr>

</tr>
<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>ساخت کلاس جدید پرداخت و ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>ساخت کلاس جدید که از OrderService ارث‌بری می‌کند و توابع مربوط به سفارش تلفنی یک پرینت ساده انجام می‌دهند. </p>
</td>
</tr>

</tr>
<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن روش ثبت سفارش تلفنی با شماره ۳</p>
</td>
<td width="292">
<p>اضافه کردن یک شرط برای چک کردن این که روش ثبت سفارش تلفنی است یا خیر.</p>
</td>
</tr>

</tr>
<tr>
<td width="64">
<p><strong>۵</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن روش پرداخت تلفنی</p>
</td>
<td width="292">
<p>اضافه کردن یک شرط برای چک کردن این که اگر روش ثبت سفارش تلفنی است پرداخت نیز تلفنی باشد./p>
</td>
</tr>
</tbody>
</table>

مجموع تعداد تغییرات: ۵

### گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID
در خصوص این برنامه‌ای که نوشته شده بود و شما یک قابلیت به آن اضافه کردید، بر اساس اصول SOLID موارد نقض و یا محقق شدن هر کدام از آن اصول را بیان کنید. در بیان موارد تحقق و نقض، علت تحقق و یا نقض را نیز به صورت کامل توضیح دهید:

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>نابع main میتوان گفت دقیقا همین موضوع را نشان میدهد و کلاس Message نیز به این صورت است.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کلاس Main به این اصل را برآورده می‌کند و برای اضافه کردن قابلیت جدید نیاز به تغییر زیاد در آن نبود.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>در کلاس orderService این اصل به وضوح نقض می‌شود. در هنگام اضافه کردن تماس تلفنی، هم باید خود orderService را تغییر داد و هم تمام کلاس‌های زیرمجموعه آن را باید تغییر داد و توابع با بدنه خالی به آنها اضافه کرد.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>بین کلاس‌های مربوط به orderService ارث‌بری به شکل درست برقرار است و رابطه is-a بین کلاس orderService و باقی زیر کلاس‌های آن وجود دارد.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>در کلاس OrderService تمام توابع زیرکلاس‌ها قرار گرفته‌اند که باعث می‌شود مجبور شویم در زیر‌کلاس‌ها، توابع خالی قرار دهیم.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کلاس orderService بر پایه همین اصل است.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>با وجود کلاس orderService، همچنان در استفاده از روش‌های مختلف این واسطه‌گری به درسنی انجام نمی‌شود. در کلاس Main مجبور هستیم هر روش رو به شکل جداگانه فراخوانی کنیم. اگر این تفکیک در سمت یک کلاس واسط انجام شود بهتر است.</p>
</td>
</tr>
</tbody>
</table>

در خصوص هرکدام از موارد نقض هرکدام از اصول، یک راهکار را به منظور رفع آن مشکل ارایه داده و در جدول زیر ثبت نمایید:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>OCP</p>
</td>
<td width="246">
<p>در کلاس orderService این اصل به وضوح نقض می‌شود. در هنگام اضافه کردن تماس تلفنی، هم باید خود orderService را تغییر داد و هم تمام کلاس‌های زیرمجموعه آن را باید تغییر داد و توابع با بدنه خالی به آنها اضافه کرد.</p>
</td>
<td width="284">
<p>در کلاس orderService به شکل کلی دو تابع برای ثبت و پرداخت سفارش قرار می‌دهیم و در باقی کلاس ها این توابع را بازنویسی می‌کنیم.</p>
</td>
</tr>
<tr>
<td width="168">
<p>ISP</p>
</td>
<td width="246">
<p>در کلاس OrderService تمام توابع زیرکلاس‌ها قرار گرفته‌اند که باعث می‌شود مجبور شویم در زیر‌کلاس‌ها، توابع خالی قرار دهیم.</p>
</td>
<td width="284">
<p>در کلاس orderService به شکل کلی دو تابع برای ثبت و پرداخت سفارش قرار می‌دهیم و در باقی کلاس ها این توابع را بازنویسی می‌کنیم.</p>
</td>
</tr>
<tr>
<td width="168">
<p>DIP</p>
</td>
<td width="246">
<p>با وجود کلاس orderService، همچنان در استفاده از روش‌های مختلف این واسطه‌گری به درسنی انجام نمی‌شود. در کلاس Main مجبور هستیم هر روش رو به شکل جداگانه فراخوانی کنیم.</p>
</td>
<td width="284">
<p>یک کلاس واسط ایجاد می‌کنیم که این تفکیک را انجام دهد. </p>
</td>
</tr>
</tr>
</tbody>
</table>

### گام ۳: اصلاح موارد نقض
در نهایت، بر اساس تحلیلی که انجام داده‌اید و راه حل‌هایی که در بخش قبل ارایه کردید، کد را اصلاح کرده و بر روی مخزن گیت‌هاب و در پوشه‌ای مجزا از گام قبل commit و push کنید. انتظار می‌رود که تمامی راه حل‌های پیشنهادی خود را بر روی این نسخه اعمال کنید و تمامی بهبودهایی که انجام می‌دهید، در جداول بخش قبل موجود باشد.

### گام ۴: بررسی مجدد تغییرات مورد نیاز
فرض کنید که گام 1 را برای کد اصلاح شده (پس از انجام گام‌های ۲ و ۳) اجرا کرده‌اید.
1. در این صورت از انجام کدام یک از تغییرات ثبت شده در جدول گام ۱ معاف خواهید شد؟

بعد از اصلاح کد بر اساس اصول SOLID، نیاز به تغییرات زیر در کد قبلی حذف می‌شود:

نیاز به افزودن توابع خالی در زیرکلاس‌ها: با اصلاح واسط‌ها و کلاس‌ها، دیگر نیازی به توابع خالی نخواهد بود.
<br/>
تغییر مکرر در کلاس Main برای اضافه کردن روش‌های جدید: با ایجاد یک کلاس واسط که مدیریت روش‌های مختلف را انجام دهد، کلاس Main نیازی به تغییر برای هر روش جدید ندارد.

2. تعداد تغییرات مورد نیاز، چند تغییر خواهد شد؟
   با توجه به اصلاحات انجام شده بر اساس اصول SOLID، تعداد تغییرات مورد نیاز به شرح زیر خواهد بود:

ایجاد کلاس ServiceOrderPhone و پیاده‌سازی واسط ServiceOrder:
ایجاد کلاس جدید برای ثبت و پرداخت سفارش تلفنی.
اضافه کردن توابع جدید به واسط ServiceOrder:
افزودن توابع جدید برای ثبت و پرداخت سفارش تلفنی.
افزودن قابلیت جدید به برنامه:
اضافه کردن قابلیت سفارش تلفنی به برنامه به گونه‌ای که کاربر بتواند سفارش خود را ثبت و پرداخت کند.
با این تفاصیل، تعداد تغییرات مورد نیاز از چندین تغییر به سه تغییر اصلی کاهش می‌یابد.

### گام ۵: جمع بندی
در این بخش، بیان کنید که از این گام چه نتیجه‌ای گرفته‌اید؟ و به نظر شما به کارگیری صحیح اصول SOLID در گام‌های ۳ و ۴ چه مزایایی را نسبت به حالتی دارد که این اصول رعایت نشده‌بود؟
