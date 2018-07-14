import urllib.request
import time

def send_to_twitter(msg):
    password_manager = urllib.request.HTTPPasswordMgr()
    password_manager.add_password("Twitter API","http://twitter.com/statuses", "dey_Jishnu", "Saraswati_20")
    http_handler = urllib.request.HTTPBasicAuthHandler(password_manager)
    page_opener = urllib.request.build_opener(http_handler)
    urllib.request.install_opener(page_opener)
    params = urllib.parse.urlencode( {'status': msg} )
    resp = urllib.request.urlopen("http://twitter.com/statuses/update.json", params)
    resp.read()

def get_price():
    page = urllib.request.urlopen("http://www.beans-r-us.biz/prices-loyalty.html")
    text = page.read().decode("utf8")
    pos = text.find(">$")
    start_of_price = pos + 2
    end_of_price = pos + 6
    return(text[start_of_price:end_of_price])

choice = input("Do you want to know the price immediately (Y/N)?")

if choice == "Y":
    send_to_twitter(get_price())
else:
    price = 99.99
    while price > 4.74:
        time.sleep(900)
        price = float(get_price())
    send_to_twitter("Buy !")
