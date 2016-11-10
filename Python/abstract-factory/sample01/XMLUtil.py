from xml.etree import ElementTree as ET

class XMLUtil(object):
    @staticmethod
    def getFactoryNames():
        try:
            tree = ET.parse('config.xml')
            root = tree.getroot()
        except:
            print('Error: cannot parse file: config.xml.')

        factoryNames = list()

        for factory in root.findall('className'):
            factoryNames.append(factory.text)
        return factoryNames
