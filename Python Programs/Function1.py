import urllib.request

def get_price():
    page = urllib.request.urlopen("http://www.beans-r-us.biz/prices-loyalty.html")
    text = page.read().decode("utf8")
    pos = text.find(">$")
    start_of_price = pos + 2
    end_of_price = pos + 6
    print(text[start_of_price:end_of_price])

get_price()
